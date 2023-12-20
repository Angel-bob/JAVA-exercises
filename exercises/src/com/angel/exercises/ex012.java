package com.angel.exercises;

public class ex012 {


    /*
    factorial using recursion
     */
    public static void main(String[] args) {

        System.out.println(Fatorial(5));

        System.out.println(fatorialRecursive(5));
    }

    static int Fatorial(int number){

        int total = 1;
        for(int i = number; i > 1; i--){
            total *= i;
        }
        return total;
    }

    static int fatorialRecursive(int number){

        int total= 0;
        if(number == 0){
            return 1;
        }
        total = number * fatorialRecursive(number-1);

        return total;
    }

}
