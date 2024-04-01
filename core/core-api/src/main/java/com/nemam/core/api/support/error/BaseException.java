package com.nemam.core.api.support.error;

public class BaseException extends RuntimeException {

    private final ErrorType errorType;

    private final Object data;

    public BaseException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
        this.data = null;
    }

    public BaseException(ErrorType errorType, Object data) {
        super(errorType.getMessage());
        this.errorType = errorType;
        this.data = data;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public Object getData() {
        return data;
    }

}
