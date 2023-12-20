package com.angel.exercises;

import java.util.Random;

public class ex008 {

    /*
    Generate and print an M10x10 matrix with random values from 0 to 9. After that,
    indicate which is the highest and lowest value of row 5 and which is the highest and lowest value of the column
     */
    public static void main(String[] args) {

        Random generate = new Random();


        int[][] mtr = new int[10][10];

        for(int i = 0; i < mtr.length; i++) {
            for(int j = 0; j < mtr[i].length; j++) {
                mtr[i][j] = generate.nextInt(100);
            }
        }

        int largestValueOfRow = 0;
        int lowestLineValue = 0;

        for(int i = 0; i < mtr[5].length; i++) {
            if(mtr[5][i] > largestValueOfRow){
                largestValueOfRow = mtr[5][i];
            }

            if(mtr[5][i] < lowestLineValue){
                lowestLineValue = mtr[5][i];
            }
        }

        System.out.println("Highest line 5:   " + largestValueOfRow);
        System.out.println("Lowest line 5:    " + lowestLineValue);

        int HighestColumn = 0;
        int lowestColumn = 0;

        for(int i = 0; i < mtr.length; i++) {
            if(mtr[i][7] > HighestColumn){
                HighestColumn = mtr[5][i];
            }

            if(mtr[i][7] < lowestLineValue){
                lowestLineValue = mtr[5][i];
            }
        }

        System.out.println("Highest column 7: " + HighestColumn);
        System.out.println("Lowest column 7:  " + lowestColumn);






    }
}
