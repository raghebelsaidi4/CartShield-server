package com.ragheb.shop.exception;

/**
 *
 * @author Ragheb
 */
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}