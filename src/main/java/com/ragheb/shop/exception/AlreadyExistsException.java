package com.ragheb.shop.exception;

/**
 *
 * @author Ragheb
 */
public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String message) {
        super(message);
    }
}
