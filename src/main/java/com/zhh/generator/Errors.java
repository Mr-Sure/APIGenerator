package com.zhh.generator;

import com.zhh.generator.annotations.ErrorInterface;

public enum Errors implements ErrorInterface {
    /**
     * comment 1
     */
    INVALID_PARAMETER(10000, ""),

    // comment 2
    OBJECT_NOT_FOUND(10001, ""),
    ;
//
    public final int value;
    public final String message;

    Errors(int value, String message) {
        this.value = value;
        this.message = message;
    }

    @Override
    public int value() {
        return value;
    }

    @Override
    public String message() {
        return message;
    }
}
