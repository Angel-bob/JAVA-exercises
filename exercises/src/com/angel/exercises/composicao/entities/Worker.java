package com.angel.exercises.composicao.entities;

import com.angel.exercises.composicao.entities.enums.WorkLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkLevel level;
    private double baseSalary;


    //Associations
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    //Constructors

    public Worker(){}

    public Worker(String name, WorkLevel level, double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }



    //methods

    private boolean verifyContract(HourContract contract){

        for(HourContract cc: contracts){
            if (cc.equals(contract)){
                return true;
            }
        }
        return false;
    }


    public void addContract(HourContract contract){

        if(verifyContract(contract)){
            System.out.println("Contrato já existe");
        }
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){

        if(verifyContract(contract)){
            System.out.println("Contrato removido");
        }
        System.out.println("Contrato não encontrado na lista");

    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c: contracts){

            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);

            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


//    @Override
//    public String toString() {
//        StringBuilder s = new StringBuilder();
//        s.append("Name: " + name + "\n" + "Department: " + department.getName() + "\n" + "Income for ");
//    }
}
