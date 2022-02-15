package de.jpx3.intave.access.player.storage;

import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.function.Consumer;

public interface StorageGateway {
  void requestStorage(UUID id, Consumer<ByteBuffer> lazyReturn);
  void saveStorage(UUID id, ByteBuffer storage);
}
