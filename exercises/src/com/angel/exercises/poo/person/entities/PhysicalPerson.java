package com.angel.exercises.poo.person.entities;

public class PhysicalPerson extends Person{

    private Double healthSpending;

    public PhysicalPerson(){
        super();
    }

    public PhysicalPerson(String name, double annualIncome, double healthSpending){
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    @Override
    public double calculateTax() {

        if(getAnnualIncome() >= 20000.00){
            return (getAnnualIncome() * 2.5) - (healthSpending * 5.0);
        }
        return (getAnnualIncome() * 1.5) - (healthSpending * 5.0);
    }


    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }
}
