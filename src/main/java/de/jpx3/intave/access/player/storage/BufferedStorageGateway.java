package de.jpx3.intave.access.player.storage;

import com.google.common.collect.Maps;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

public class BufferedStorageGateway implements StorageGateway {
  private final Map<UUID, Deque<Consumer<ByteBuffer>>> loadRequests = Maps.newConcurrentMap();
  private final Map<UUID, Deque<ByteBuffer>> saveRequests = Maps.newConcurrentMap();

  @Override
  public void requestStorage(UUID id, Consumer<ByteBuffer> lazyReturn) {
    loadRequests.computeIfAbsent(id, uuid -> new ArrayDeque<>()).offerLast(lazyReturn);
  }

  @Override
  public void saveStorage(UUID id, ByteBuffer storage) {
    saveRequests.computeIfAbsent(id, uuid -> new ArrayDeque<>()).offerLast(storage);
  }

  public void fillStorageRequest(UUID id, ByteBuffer byteBuffer) {
    Deque<Consumer<ByteBuffer>> requests = loadRequests.get(id);
    if (requests != null) {
      Consumer<ByteBuffer> request = requests.pollFirst();
      if (request != null) {
        request.accept(byteBuffer);
      }
      if (requests.isEmpty()) {
        loadRequests.remove(id);
      }
    }
  }

  public ByteBuffer fetchSaveRequest(UUID id) {
    Deque<ByteBuffer> requests = saveRequests.get(id);
    if (requests != null) {
      ByteBuffer save = requests.pollFirst();
      if (requests.isEmpty()) {
        saveRequests.remove(id);
      }
      return save;
    }
    return null;
  }
}
