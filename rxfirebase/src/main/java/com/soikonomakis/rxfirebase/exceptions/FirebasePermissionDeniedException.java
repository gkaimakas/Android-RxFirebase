package com.soikonomakis.rxfirebase.exceptions;

/**
 * This exception occured when the firebase returns a permission
 * denied error
 */
public class FirebasePermissionDeniedException extends Exception {

  public FirebasePermissionDeniedException() {
  }

  public FirebasePermissionDeniedException(String detailMessage) {
    super(detailMessage);
  }

  public FirebasePermissionDeniedException(String detailMessage, Throwable throwable) {
    super(detailMessage, throwable);
  }

  public FirebasePermissionDeniedException(Throwable throwable) {
    super(throwable);
  }
}
