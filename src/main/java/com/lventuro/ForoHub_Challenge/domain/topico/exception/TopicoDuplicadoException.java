package com.lventuro.ForoHub_Challenge.domain.topico.exception;

public class TopicoDuplicadoException extends RuntimeException {
    public TopicoDuplicadoException(String message) {
        super(message);
    }

    public TopicoDuplicadoException(String message, Throwable cause) {
        super(message, cause);
    }
}


