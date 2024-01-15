package com.angel.exercises.poo.figuras.entities;

import com.angel.exercises.poo.figuras.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(){}

    public Shape(Color color){
        this.color = color;
    }
    public abstract double area();

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
