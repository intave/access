package de.jpx3.intave.access;

/**
 * This exception is not used
 */
public final class UnsupportedFallbackOperationException extends IntaveInternalException {
  public final static UnsupportedFallbackOperationException INSTANCE = new UnsupportedFallbackOperationException("Can't locate player here");

  private UnsupportedFallbackOperationException() {
    super();
  }

  private UnsupportedFallbackOperationException(String message) {
    super(message);
  }

  @Override
  public void setStackTrace(StackTraceElement[] stackTrace) {
    super.setStackTrace(stackTrace);
  }

  @Override
  public synchronized Throwable fillInStackTrace() {
    return super.fillInStackTrace();
  }
}
