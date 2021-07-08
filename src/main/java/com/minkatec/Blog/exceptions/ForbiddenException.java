package com.minkatec.Blog.exceptions;

public class ForbiddenException extends RuntimeException {
    private static final String DESCRIPTION = "Forbidden. Insufficient role";

    public ForbiddenException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

}