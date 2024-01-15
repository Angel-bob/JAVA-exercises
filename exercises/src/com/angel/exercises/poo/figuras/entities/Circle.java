package com.angel.exercises.poo.figuras.entities;

import com.angel.exercises.poo.figuras.enums.Color;

public class Circle extends Shape {

    private Double radius;

    public Circle(){
        super();
    }

    public Circle(Color color, double radius){
        super(color);
        this.radius = radius;
    }

    //method ( calculate area circle );
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
