package com.javaintern;
import java.util.Scanner;
public class Temperature {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        //taking user input for temperature
        System.out.println("Enter the Temperature Value here:");
        double temperature =sc.nextDouble();

        //taking type of unit of measurement from user
        System.out.println("Enter the unit of measurement (For Celsuis Type C and For Fahrenheit Type F): ");
        char tempunit=sc.next().charAt(0);

        //conversts the temperature to Fahrenheit
        if(tempunit=='C' || tempunit=='c'){
            double fahrenheit =(temperature * 9/5)+32;
            System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit.\n",temperature,fahrenheit);

            //converts the Temperature to Celsius
        }else if(tempunit== 'F'|| tempunit=='f'){
            double celsius =(temperature-32)*5/9;
            System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Celsius.\n",temperature,celsius);
        } else{
            System.out.println("You have entered invalid unit of measurement (Please enter C or c for Celsius and F or f for Fahrenheit.");
        }

        sc.close();
    }
}
