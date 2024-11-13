package com.wrdeveloper.wrapi.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{


    public ResourceNotFoundException(Object id){
        super("Resource Not Found. ID " + id);
    }
}
