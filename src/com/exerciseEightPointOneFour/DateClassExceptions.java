package com.exerciseEightPointOneFour;

public class DateClassExceptions extends Exception{
    public DateClassExceptions() {
    }

    public DateClassExceptions(String message) {
        super(message);
    }

    public DateClassExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public DateClassExceptions(Throwable cause) {
        super(cause);
    }

    public DateClassExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
