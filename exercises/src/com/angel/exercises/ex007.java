package com.angel.exercises;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ex007 {

    /*
   Generate and print an M4x4 matrix with random values center 0-9.
   After that, determine the largest number and its position (row, column).
     */

    public static void main(String[] args) {

        Random generate = new Random();

        int higherValue = Integer.MIN_VALUE;
        int line = 0, column = 0;

        int[][] mtr = new int[4][4];

        for(int i = 0; i < mtr.length; i++) {
            for(int j = 0; j < mtr[i].length; j++) {
                mtr[i][j] = generate.nextInt(100);

                if(mtr[i][j] > higherValue) {
                    higherValue = mtr[i][j];
                    line = i;
                    column = j;
                }
            }
        }


        for(int i = 0; i < mtr.length; i++) {
            System.out.println("i: " + i);
            for(int j = 0; j < mtr[i].length; j++) {
                System.out.println(" " + j + ": " + mtr[i][j]);
            }
        }



        System.out.println("Higher value = " + higherValue);
        System.out.println("Line: " + line);
        System.out.println("Column: " + column);

    }
}
