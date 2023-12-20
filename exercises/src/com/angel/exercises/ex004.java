package com.angel.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex004 {

    /*
    Make a program to read a vector of N integers.
    Then show on the screen the average Arithmetic only of the even numbers read,
    with one decimal place. If no even number is typed, show the message "NO EVEN NUMBER"
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd, qtdPar = 0, total = 0;
        double media;
        int[] vector;

        System.out.print("How many elements will the vector have? ");
        qtd = sc.nextInt();

        vector = new int[qtd];

        for (int i = 0; i < vector.length; i++){
            System.out.print("Add a number: ");
            vector[i] = sc.nextInt();
            total += vector[i];

            if(vector[i] % 2 == 0){
                qtdPar++;
            }
        }

        media = total / vector.length;

        if(qtdPar > 0){
            System.out.printf("Average of Pairs = %.2f", media);
        }else {
            System.out.println("No even numbers");
        }

        sc.close();
    }
}
