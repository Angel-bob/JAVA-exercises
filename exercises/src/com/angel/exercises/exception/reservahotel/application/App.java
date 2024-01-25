package com.angel.exercises.exception.reservahotel.application;

import com.angel.exercises.exception.reservahotel.model.entities.Reservation;
import com.angel.exercises.exception.reservahotel.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
        Make a program to read hotel reservation data (room number, check-in date and check-out date)
        and show reservation data, including its duration in days. Then read new arrival and departure dates, update
        the reservation, and show the reservation again with the updated data. The program must not accept invalid data
        for reservation, according to the following rules:
            -Booking changes can only occur for future dates
            -The departure date must be greater than the arrival date
     */

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            sc.nextLine();
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());


            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (DomainException d){
            System.out.println("Error in reservation: " + d.getMessage());
        }


        sc.close();


    }
}
