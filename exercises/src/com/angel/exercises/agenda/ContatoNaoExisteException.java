package com.angel.exercises.agenda;

public class ContatoNaoExisteException extends Exception{

    private String name;

    public ContatoNaoExisteException(String name){
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Contato: " + name + " não existe!";
    }
}
