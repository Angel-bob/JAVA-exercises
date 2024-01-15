package com.angel.exercises.poo.products.entities;

import com.angel.exercises.poo.products.entities.Product;

public class ImportedProduct extends Product {

    private Double customsFee;

    //constructors
    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    //methods
    @Override
    public String priceTag() {
        return getName() + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")";
    }

    public double totalPrice(){
        return getPrice() + customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
