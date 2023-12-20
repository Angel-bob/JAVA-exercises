package com.angel.exercises;

import java.util.Stack;

public class ex010 {

    /*
    Using the Stack class, develop an algorithm that converts decimal numbers to binary.
     */
    public static void main(String[] args) {


        printCoversion(2);
        printCoversion(4);
        printCoversion(10);
        printCoversion(25);
        printCoversion(10035);


    }

    static void printCoversion(int numb){
        System.out.println(numb + " in binary is " + convercionDecimalToBinary(numb));
    }

    static String convercionDecimalToBinary(int number){

        Stack<Integer> stack = new Stack<>();
        String binary = "";

        while(number > 0){
            stack.push(number % 2);
            number /= 2;
        }

        while (!stack.isEmpty()){
            binary += stack.pop();
        }

        return binary;
    }


//    static String converter(int number, int base){
//
//        if(base > 16){
//            throw new IllegalArgumentException();
//        }
//
//        Stack<Integer> pilha = new Stack<>();
//        String b = "";
//        String bases = "0123456789ABCDEF";
//
//        while(number > 0){
//            pilha.push(number % base);
//            number /= base;
//        }
//
//        while (!pilha.isEmpty()){
//            b += bases.charAt(pilha.pop());
//        }
//
//        return b;
//    }
}
