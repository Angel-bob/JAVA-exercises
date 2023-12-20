package com.angel.exercises;

import java.util.Stack;

public class ex011 {

    /*
    Using stack class, develop an algorithm that solves the Tower of Hanoi puzzle
     */
    public static void main(String[] args) {

        Stack<Integer> ori = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        ori.push(3);
        ori.push(2);
        ori.push(1);

        hanoiTower(ori.size(), ori, dest, aux);


    }

    public static void hanoiTower(int n, Stack<Integer> ori, Stack<Integer> des, Stack<Integer> aux){

        if(n > 0){
            hanoiTower(n-1, ori, aux, des);
            des.push(ori.pop());
            System.out.println("----------");
            System.out.println("Original: " + ori);
            System.out.println("Fate:  " + des);
            System.out.println("Aux: " + aux);
            hanoiTower(n-1, aux, des, ori);
        }
    }




}
