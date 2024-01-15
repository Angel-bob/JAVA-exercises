package com.angel.exercises.poo.products.entities;

import com.angel.exercises.poo.products.entities.Product;

import java.time.LocalDate;

public class UsedProduct extends Product {

    private LocalDate manufactureDate;

    //constructors
    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    //methods


    @Override
    public String priceTag() {
        return getName() + " (used) $ " + getPrice() + " (Manufacture date: " + manufactureDate + ")";
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
