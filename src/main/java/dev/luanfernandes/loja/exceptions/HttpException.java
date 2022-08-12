package dev.luanfernandes.loja.exceptions;

import java.io.Serial;

public class HttpException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 6386464284407741612L;

    public HttpException(String message) {
        super(message);
    }
}
