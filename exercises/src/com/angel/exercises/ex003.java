package com.angel.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex003 {

    /*
    Make a program to read an integer N and then a vector of N real numbers.
    Then Show on the screen the arithmetic mean of all elements to three decimal places.
    Then show them all Elements of the vector that are below average, with one decimal place each
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd;
        double media, total = 0;
        double[] vector;

        System.out.print("How many elements will the vector have?");
        qtd = sc.nextInt();

        vector = new double[qtd];

        for (int i = 0; i < vector.length; i++){
            System.out.print("Add a number: ");
            vector[i] = sc.nextDouble();
            total += vector[i];
        }

        media = total / vector.length;

        System.out.println(" ");

        System.out.printf("MEDIA = %.3f%n", media);

        System.out.println("Below-average elements: ");
        for (int i = 0; i < vector.length; i++){
            if(vector[i] < media){
                System.out.println(vector[i]);
            }
        }

        sc.close();

    }
}
