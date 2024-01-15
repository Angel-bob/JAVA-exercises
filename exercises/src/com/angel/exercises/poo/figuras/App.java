package com.angel.exercises.poo.figuras;

import com.angel.exercises.poo.figuras.entities.Circle;
import com.angel.exercises.poo.figuras.entities.Rectangle;
import com.angel.exercises.poo.figuras.entities.Shape;
import com.angel.exercises.poo.figuras.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
        Make a program to read data from N figures (N provided by the user),
        and then show the areas of these figures in the same order in which they were typed.
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int quantityShapes = sc.nextInt();

        List<Shape> shapeList = new ArrayList<>();
        for(int i = 1; i <= quantityShapes; i++){

            sc.nextLine();
            char shape;

            //verify entry
            while(true){

                System.out.println("Shape #" + i + " data: ");
                System.out.print("Rectangle or Circle (r/c)? ");
                shape = sc.next().charAt(0);

                if(shape == 'r' || shape == 'c'){
                    break;
                }else{
                    System.out.println("Invalid Shape\n");
                }
            }

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());

            if(shape == 'r'){
                System.out.print("Width: ");
                double shapeWidth = sc.nextDouble();
                System.out.print("Heigth: ");
                double shapeHeigth = sc.nextDouble();

                shapeList.add(new Rectangle(color, shapeWidth, shapeHeigth));
            }else if(shape == 'c'){
                System.out.print("Radius: ");
                double shapeRadius = sc.nextDouble();

                shapeList.add(new Circle(color, shapeRadius));
            }

        }

        System.out.println();

        System.out.println("SHAPE AREAS:");
        for (Shape sh: shapeList){
            System.out.printf("%.2f%n",sh.area());
        }

        //end
        sc.close();


    }
}
