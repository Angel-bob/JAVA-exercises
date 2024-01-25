package com.angel.exercises;

public class ex013 {

    /*
        There is a programming language with only four operations and one variable x:

            * ++X and X++ incremments the value of the variable x by 1;
            * --X and X-- decrements the value of the variable x by 1;

        Given an array of Strings operations containing a list of operations, return the final value of
        x after performing all the operations.
     */
    public static void main(String[] args) {

        int x = 0;
        String[] operations = {"x++", "++x", "--x", "x--"};

        for(String op: operations){
            int anitgoX = x;

            if(op.contains("+")){
                x++;
                System.out.println(op + ": X is incremented by 1, x = " + anitgoX + " + 1 = " + x);
            }else if(op.contains("-")){
                x--;
                System.out.println(op + ": X is incremented by 1, x = " + anitgoX + " - 1 = " + x);
            }
        }


    }
}
