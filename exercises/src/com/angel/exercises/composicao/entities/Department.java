package com.angel.exercises.composicao.entities;

public class Department {

    private String name;

    public Department(){
        super();
    }

    public Department(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
