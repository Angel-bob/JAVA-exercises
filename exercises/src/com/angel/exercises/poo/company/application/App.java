package com.angel.exercises.poo.company.application;

import com.angel.exercises.poo.company.entities.Employee;
import com.angel.exercises.poo.company.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int quantityEmployees = sc.nextInt();

        List<Employee> employees = new ArrayList<>();
        for(int i = 0; i < quantityEmployees; i++){
            String typeEmployee;
            sc.nextLine();
            while(true){

                System.out.printf("Employee #%d data: %n", (i+1));
                System.out.print("Outsourced (y/n)? ");
                typeEmployee = sc.nextLine().toLowerCase();

                if(typeEmployee.equals("y") || typeEmployee.equals("n")){
                    break;
                }else {
                    System.out.println("Invalid");
                }
            }

            System.out.print("Name: ");
            String nameEmployee = sc.nextLine();
            System.out.print("Hours: ");
            Integer hoursEmployee = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(typeEmployee.equals("y")){
                System.out.print("Additional charge: ");
                double aditionalChargeEmployee = sc.nextDouble();
                employees.add(new OutsourcedEmployee(nameEmployee, hoursEmployee, valuePerHour, aditionalChargeEmployee));
            }

            if(typeEmployee.equals("n")){
                employees.add(new Employee(nameEmployee, hoursEmployee, valuePerHour));
            }

        }

        System.out.println();

        //Print Employees
        System.out.println("PAYMENTS: ");
        for(Employee em: employees){
            System.out.println(em);
        }

        //end
        sc.close();

    }
}
