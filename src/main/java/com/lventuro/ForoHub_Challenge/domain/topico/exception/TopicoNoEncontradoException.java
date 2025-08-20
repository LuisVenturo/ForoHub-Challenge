package com.lventuro.ForoHub_Challenge.domain.topico.exception;

public class TopicoNoEncontradoException extends RuntimeException {

    public TopicoNoEncontradoException(String message) {
        super(message);
    }

    public TopicoNoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
