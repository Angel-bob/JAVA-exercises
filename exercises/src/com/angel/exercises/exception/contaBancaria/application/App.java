package com.angel.exercises.exception.contaBancaria.application;

import com.angel.exercises.exception.contaBancaria.model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
        Fazer um programa para ler os dados de uma conta bancária e depois realizar um
        saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
        ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
        saque da conta.
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int numberAccount = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holderAccount = sc.nextLine();
        System.out.print("Initial balance: ");
        double iniBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double limitBalance = sc.nextDouble();

        Account acc = new Account(numberAccount, holderAccount, iniBalance, limitBalance);
        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        double amountW = sc.nextDouble();

        try{
            acc.withdraw(amountW);
            System.out.println("New balance: " + acc.getBalance());
        }
        catch (IllegalArgumentException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();

    }
}
