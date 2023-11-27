//
//Create flowchart and pseudocode for the following:
//        Input a year and find whether it is a leap year or not.
//        Take two numbers and print the sum of both.
//        Take a number as input and print the multiplication table for it.
//        Take 2 numbers as inputs and find their HCF and LCM.
//        Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year to check leap year or not");
        int year = input.nextInt();

        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println( year + " is a leap year");
            }
            else {
                System.out.println( year + " is not a leap year");
            }
        } else {
            if( year % 4 == 0){
                System.out.println( year + " is a leap year");
            }
            else {
                System.out.println( year + " is not a leap year");
            }
        }

        System.out.println("...............................................");
        System.out.println(" Please enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(" Sum of "+num1 +" and "+num2+ " is "+(num1 + num2));

        System.out.println("................................................");
        System.out.println("Enter a number to print multiplication for it");
        int number = input.nextInt();
        int i = 1;
        while(i <=10){
            System.out.println( number+" multiplies "+i+" is "+ (number*i));
            i++;
        }

        System.out.println("................................................");
        System.out.println("Enter two numbers  to find out lcm and hcf");
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int product = number3 * number4;
        int hcf;
        int lcm;

        while(number3 != number4){
            if(number3 > number4)
                number3 = number3 - number4;

            else
                number4 = number4 - number3;
        }

        hcf = number3;

        lcm = product/hcf;

        System.out.println(" HCF  is "+hcf);
        System.out.println(" LCM  is "+lcm);

        System.out.println("................................................");
     // Skipping 5th question due to code complexity as this assignment is flowchart

    }
}