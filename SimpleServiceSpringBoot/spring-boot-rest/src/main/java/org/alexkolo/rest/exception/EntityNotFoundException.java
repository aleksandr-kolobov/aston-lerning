package org.alexkolo.rest.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String massage) {
        super(massage);
    }

}
