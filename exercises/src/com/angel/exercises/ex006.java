package com.angel.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {

    /*
    Make a program to read a set of N students' names as well as the grades they got in the 1st and 2nd semesters.
    Each of this information must be stored in a vector. Then, print the names of the approved students,
    considering approved those whose grade point average is higher or equal to 6.0 (six).
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media;

        System.out.print("How many students will be typed? ");
        n = sc.nextInt();

        String[] names = new String[n];
        double[] notes1 = new double[n];
        double[] notes2 = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Enter the student's name, first grade, and second grade:\n", i + 1);
            sc.nextLine();
            names[i] = sc.nextLine();
            notes1[i] = sc.nextDouble();
            notes2[i] = sc.nextDouble();
        }

        System.out.println("Approved students:");

        for (int i=0; i<n; i++) {
            media = (notes1[i] + notes2[i]) / 2;

            if(media >= 6.0) {
                System.out.printf("%s\n", names[i]);
            }
        }

        sc.close();
    }
}
