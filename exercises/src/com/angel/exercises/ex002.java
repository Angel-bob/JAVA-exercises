package com.angel.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {

    /*
    Make a program to read two vectors A and B, containing N elements each. Then,
    generate a third vector C where each element of C is the sum of the corresponding elements of A and B.
    the vector C generated.
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd;
        int[] vectorA, vectorB, vectorC;

        System.out.print("How many values will each vector have?");
        qtd = sc.nextInt();

        vectorA = new int[qtd];
        vectorB = new int[qtd];
        vectorC = new int[qtd];

        System.out.println("Enter the vector values A:");
        for(int i = 0; i < vectorA.length; i++){
            vectorA[i] = sc.nextInt();
        }

        System.out.println("Enter the vector values B:");
        for(int i = 0; i < vectorB.length; i++){
            vectorB[i] = sc.nextInt();
        }

        for(int i = 0; i < qtd; i++){
            vectorC[i] = (vectorA[i] + vectorB[i]);
        }

        System.out.println("Resultant Vector:");
        for(int n: vectorC){
            System.out.println(n);
        }

        sc.close();
    }
}
