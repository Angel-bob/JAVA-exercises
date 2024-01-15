package com.angel.exercises.poo.person.application;

import com.angel.exercises.poo.person.entities.LegalPerson;
import com.angel.exercises.poo.person.entities.Person;
import com.angel.exercises.poo.person.entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int quantityPayers = sc.nextInt();

        List<Person> personList = new ArrayList<>();
        for(int i = 1; i <= quantityPayers; i++){

            char payer;
            while(true){

                System.out.println("Tax payer #" + i + " data: ");
                System.out.print("Individual or company (i/c)? ");
                payer = sc.next().charAt(0);

                if(payer == 'i' || payer == 'c'){
                    break;
                }else{
                    System.out.println("Invalid payer\n");
                }
            }

            sc.nextLine();
            System.out.print("Name: ");
            String namePayer = sc.nextLine();
            System.out.print("Anual income: ");
            double incomePayer = sc.nextDouble();

            if(payer == 'i'){

                System.out.print("Health expenditures: ");
                double hpExpenditPayer = sc.nextDouble();
                personList.add(new PhysicalPerson(namePayer, incomePayer, hpExpenditPayer));
            }

            if(payer == 'c'){

                System.out.print("Number of employees: ");
                int quantityEmployees = sc.nextInt();
                personList.add(new LegalPerson(namePayer, incomePayer, quantityEmployees));
            }
        }

        System.out.println();

        double totalTaxes = 0;
        System.out.println("TAXES PAID:");
        for(Person pp: personList){
            System.out.printf("%s: $ %.2f%n", pp.getName(), pp.calculateTax());
            totalTaxes += pp.calculateTax();
        }

        System.out.println();

        System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);


        //end
        sc.close();
    }
}
