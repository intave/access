package de.jpx3.intave.access;

/**
 * An exception describing an issue within Intave probably caused by Intave.
 */
public class IntaveInternalException extends RuntimeException {
  public IntaveInternalException() {
    super();
  }

  public IntaveInternalException(String message) {
    super(message);
  }

  public IntaveInternalException(String message, Throwable cause) {
    super(message, cause);
  }

  public IntaveInternalException(Throwable cause) {
    super(cause);
  }
}
