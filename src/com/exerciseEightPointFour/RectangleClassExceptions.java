package com.exerciseEightPointFour;

public class RectangleClassExceptions extends Exception {
    public RectangleClassExceptions() {
    }

    public RectangleClassExceptions(String message) {
        super(message);
    }

    public RectangleClassExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public RectangleClassExceptions(Throwable cause) {
        super(cause);
    }

    public RectangleClassExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
