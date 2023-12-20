package com.angel.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex005 {

    /*
    Make a program to read a set of people's names and their respective ages.
    The names they must be stored in one vector, and the ages in another vector.
    Then, show the name on the screen of the older person.
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd, ageV, posi;
        int[] ages;
        String[] names;
        String name = null;

        System.out.print("How many people will the vector have? ");
        qtd = sc.nextInt();

        ages = new int[qtd];
        names = new String[qtd];

        for(int i = 0; i < qtd; i++){
            System.out.println((i+1) + "st person data: ");
            System.out.print("Name: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
        }

        ageV = ages[0];
        posi = 0;

        for (int i = 0; i < ages.length; i++){
            if(ages[i] > ageV){
                ageV = ages[i];
                posi = i;
            }


        }

        System.out.printf("Older Person Vector: %s", names[posi]);

        sc.close();
    }
}
