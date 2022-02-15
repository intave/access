package de.jpx3.intave.access.player.storage;

import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.function.Consumer;

public class EmptyStorageGateway implements StorageGateway {
  @Override
  public void requestStorage(UUID id, Consumer<ByteBuffer> lazyReturn) {
  }

  @Override
  public void saveStorage(UUID id, ByteBuffer storage) {
  }
}
