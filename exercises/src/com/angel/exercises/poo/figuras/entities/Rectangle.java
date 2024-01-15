package com.angel.exercises.poo.figuras.entities;


import com.angel.exercises.poo.figuras.enums.Color;

public class Rectangle extends Shape {

    private Double width;
    private Double heigth;

    public Rectangle(){ super(); }


    public Rectangle(Color color, double width, double heigth){
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    //method ( calculate area rectangle )
    @Override
    public double area() {
        return width * heigth;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public Double getHeigth() {
        return heigth;
    }
}

