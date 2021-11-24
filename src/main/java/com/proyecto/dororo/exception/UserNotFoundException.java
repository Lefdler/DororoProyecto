package com.proyecto.dororo.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String mensaje) {
        super(mensaje);
    }
}
