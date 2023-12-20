package com.angel.exercises;

import java.util.Scanner;
import java.util.Stack;

public class ex009 {

    /*
    Write a program that tests whether a user-supplied string of characters is a palindrome
     */
        public static void main(String[] args) {

            //Scanner sc = new Scanner(System.in);

            printResult("");
            printResult("ADA");
            printResult("ABCD");
            printResult("ABCCBA");
            printResult("Maria");


        }

        static void printResult(String word){
            System.out.println(word + " it's Palindrome? " + testaPalindromo(word));
        }

        static boolean testaPalindromo(String word){

            if(!(word.equals(""))){
                Stack<Character> pilha = new Stack<>();
                String palavraInversa = "";

                for(int i = 0; i <word.length(); i++){
                    pilha.push(word.charAt(i));
                }

                while(!pilha.isEmpty()){
                    palavraInversa += pilha.pop();
                }

                if(palavraInversa.equalsIgnoreCase(word)){
                    return true;
                }

            }


            return false;
        }
}
