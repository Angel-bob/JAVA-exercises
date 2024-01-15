package com.angel.exercises.poo.company.entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge){
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final double payment() {
        //double percentage = 110;
        //return super.payment() + ((percentage / 100) * additionalCharge);
        return super.payment() + (additionalCharge * 1.1);
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


