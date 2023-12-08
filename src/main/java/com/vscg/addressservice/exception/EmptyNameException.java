package com.vscg.addressservice.exception;

public class EmptyNameException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EmptyNameException(String msg) {
        super(msg);
    }
}