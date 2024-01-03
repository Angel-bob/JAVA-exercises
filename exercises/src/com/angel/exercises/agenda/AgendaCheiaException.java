package com.angel.exercises.agenda;

public class AgendaCheiaException extends Exception{

    @Override
    public String getMessage() {
        return "Agenda esta cheia";
    }
}
