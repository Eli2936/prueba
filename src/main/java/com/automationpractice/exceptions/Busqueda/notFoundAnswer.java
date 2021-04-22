package com.automationpractice.exceptions.Busqueda;

public class notFoundAnswer extends AssertionError{


    public notFoundAnswer(String message, Throwable cause) {
        super(message, cause);
    }

    public static String notFoundAnswer(){
        return String.format("The Answer isnot correct");
    }

}
