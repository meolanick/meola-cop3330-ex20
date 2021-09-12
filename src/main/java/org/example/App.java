/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        double order;
        String state;
        String county;
        double tax;
        double countyTax;
        double total;

        System.out.println( "What is the order amount?" );
        order = scan.nextInt();

        System.out.println("What state do you live in?");
        state = scan.next();

        System.out.println("What county do you live in?");
        scan.nextLine();
        county = scan.nextLine();


        if( state.equals("Wisconsin"))
        {
            total = order;
            tax = order * 0.05;

            if( county.equals("Eau Claire"))
            {
                countyTax = total * 0.005;
                total = order + tax + countyTax;
                System.out.printf("The tax is $%.2f.\nThe total is %.2f.\n", tax, total);
                System.exit(0);
            }
            if( county.equals("Dane"))
            {
                total = order;
                countyTax = total * 0.004;
                total = order + tax + countyTax;
                System.out.printf("The tax is $%.2f.\nThe total is %.2f.\n", tax, total);
                System.exit(0);
            }
        }

        if( state.equals("Illinois"))
        {
            total = order;
            tax = order * 0.08;
            countyTax = 0.00;
            total = order + tax + countyTax;
            System.out.printf("The tax is $%.2f.\nThe total is %.2f.\n", tax, total);
            System.exit(0);
        }

        System.out.println("The total is $" + order + ".");
    }
}
