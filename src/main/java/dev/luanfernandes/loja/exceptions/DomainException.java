package dev.luanfernandes.loja.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 3148198235437645363L;

    public DomainException(String message) {
        super(message);
    }
}
