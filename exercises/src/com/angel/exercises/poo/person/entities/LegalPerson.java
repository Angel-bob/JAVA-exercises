package com.angel.exercises.poo.person.entities;

public class LegalPerson extends Person{

   private Integer quantityEmployees;

   public LegalPerson(){
       super();
   }

   public LegalPerson(String name, double annualIncome, int quantityEmployees){
       super(name, annualIncome);
       this.quantityEmployees = quantityEmployees;
   }
    @Override
    public double calculateTax() {
        if(quantityEmployees > 10){
            return getAnnualIncome() * 1.4;
        }
        return getAnnualIncome() * 1.6;
    }

    public Integer getQuantityEmployees() {
        return quantityEmployees;
    }

    public void setQuantityEmployees(Integer quantityEmployees) {
        this.quantityEmployees = quantityEmployees;
    }
}
