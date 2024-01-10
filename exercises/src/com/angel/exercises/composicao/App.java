package com.angel.exercises.composicao;

import com.angel.exercises.composicao.entities.Department;
import com.angel.exercises.composicao.entities.HourContract;
import com.angel.exercises.composicao.entities.Worker;
import com.angel.exercises.composicao.entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
        Read data from a worker with N contracts (N provided by the user).
        Then, ask the user for a month and show what the employee's salary was that month.
     */

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Name department
        System.out.print("Enter department`s name: ");
        String departamentName = sc.nextLine();

        //data user
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level (JUNIOR, MID_LEVEL, SENIOR): ");
        String workerLevel = sc.nextLine().toUpperCase();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));
        System.out.println();



        //data contracts
        System.out.print("How many contracts to this worker? ");
        int quantityContracts = sc.nextInt();
        System.out.println();

        for(int i = 0; i < quantityContracts; i++){

            System.out.println("Enter contract #" + (i+1) + " data:");
            sc.nextLine();
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valueHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            System.out.println();

            HourContract contract = new HourContract(contractDate, valueHour, hours);
            worker.addContract(contract);
        }

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        sc.nextLine();
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        //print worker
//        System.out.println("Name: " + worker.getName());
//        System.out.println("Department: " + worker.getDepartment().getName());
//        System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));

        StringBuilder s = new StringBuilder();
        s.append("Name: " + worker.getName() + "\n" + "Department: " + worker.getDepartment().getName() + "\n");
        s.append("Income for " + monthAndYear + ": " + worker.income(year, month));

        System.out.println(s.toString());

        //end
        sc.close();







    }


}
