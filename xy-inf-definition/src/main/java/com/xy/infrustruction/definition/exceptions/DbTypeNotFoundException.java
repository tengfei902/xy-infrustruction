package com.xy.infrustruction.definition.exceptions;

public class DbTypeNotFoundException extends RuntimeException {
    public DbTypeNotFoundException() {
    }

    public DbTypeNotFoundException(String message) {
        super(message);
    }

    public DbTypeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DbTypeNotFoundException(Throwable cause) {
        super(cause);
    }

    public DbTypeNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
