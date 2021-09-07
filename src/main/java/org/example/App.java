/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        String euroS = scan.nextLine();
        System.out.print("What is the exchange rate ");
        String rateS = scan.nextLine();

        int euro = Integer.parseInt(euroS);
        double rate = Double.parseDouble(rateS);
        double total = euro*rate;

        System.out.println(String.format("%d euros at an exchange rate of %.4f is\n%.2f U.S. dollars.",euro,rate,total));
    }
}