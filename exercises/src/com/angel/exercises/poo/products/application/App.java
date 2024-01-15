package com.angel.exercises.poo.products.application;

import com.angel.exercises.poo.products.entities.ImportedProduct;
import com.angel.exercises.poo.products.entities.Product;
import com.angel.exercises.poo.products.entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class App {

    /*

     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int quantityProducts = sc.nextInt();

        List<Product> products = new ArrayList<>();
        for(int i = 1; i <= quantityProducts; i++){

            char typeProduct;
            while (true){
                System.out.println("Product #" + i + " data: ");
                System.out.print("Common, used or imported (c/u/i)? ");
                typeProduct = sc.next().charAt(0);

                if(typeProduct == 'c' || typeProduct == 'u' || typeProduct == 'i'){
                    break;
                }else{
                    System.out.println("Invalid type\n");
                }
            }

            sc.nextLine();
            System.out.print("Name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Price: ");
            double priceProduct = sc.nextDouble();

            if(typeProduct == 'c'){
                products.add(new Product(nameProduct, priceProduct));

            } else if(typeProduct == 'u'){

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                products.add(new UsedProduct(nameProduct, priceProduct, date));
            } else if (typeProduct == 'i') {

                System.out.print("Customs fee: ");
                double customsFeeProcuct = sc.nextDouble();

                products.add(new ImportedProduct(nameProduct, priceProduct, customsFeeProcuct));
            }

        }

        System.out.println();

        System.out.println("PRICE TAGS: ");
        for(Product pr: products){
            System.out.println(pr.priceTag());
        }

        //end
        sc.close();

    }
}
