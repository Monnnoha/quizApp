package com.quiz.app.exception;

public class InvalidCategoryException extends RuntimeException{
    public InvalidCategoryException(String message){
        super(message);
    }
}
