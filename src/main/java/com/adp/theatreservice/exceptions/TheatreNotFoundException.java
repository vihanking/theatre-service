package com.adp.theatreservice.exceptions;

public class TheatreNotFoundException extends RuntimeException{
    private int id;
    public TheatreNotFoundException(int id){
        this.id=id;
    }

    @Override
    public String getMessage() {
        return "Theatre Not Found By Id: "+id;
    }
}
