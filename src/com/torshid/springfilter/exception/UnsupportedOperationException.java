package com.torshid.springfilter.exception;

import com.torshid.compiler.exception.ParserException;

public class UnsupportedOperationException extends ParserException {

  private static final long serialVersionUID = 1L;

  public UnsupportedOperationException(String message) {
    super(message);
  }

  public UnsupportedOperationException(String message, Throwable cause) {
    super(message, cause);
  }

}
