package com.angel.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex001 {

    /*
    Make a program that reads N real numbers and stores them in a vector.
    Then show the largest number of the vector on the screen (assume there are no ties). Also show the position of the largest element,
    considering the first position as 0 (zero).
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd, position = 0;
        double higherValue = 0.0;

        System.out.print("How many numbers are you going to enter? ");
        qtd = sc.nextInt();

        double[] numbers = new double[qtd];

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("add a number: ");
            numbers[i] = sc.nextDouble();


            if(numbers[i] > higherValue) {
                higherValue = numbers[i];
                position = i;
            }
        }

        System.out.println("");

        System.out.printf("HIGHER VALUE = %.2f%n", higherValue);
        System.out.printf("HIGHEST VALUE POSITION = %d", position);

        sc.close();
    }


}
