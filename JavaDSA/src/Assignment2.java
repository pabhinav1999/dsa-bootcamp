//Write a program to print whether a number is even or odd, also take input from the user.
//        Take name as input and print a greeting message for that particular name.
//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        Take 2 numbers as input and print the largest number.
//        Input currency in rupees and output in USD.
//        To calculate Fibonacci Series up to n numbers.
//        To find out whether the given String is Palindrome or not.
//        To find Armstrong Number between two given number.

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check it is even or odd");
        int num = input.nextInt();
        if(num%2 == 0)
            System.out.println("It is an even number");
        else
            System.out.println("It is an odd number");
        System.out.println(".................................");
        input.nextLine();
        System.out.println("Take name as input and greet ");
        String name = input.nextLine();
        System.out.println("Hello "+name);
        System.out.println(".................................");

        System.out.println("program to find simple interest ");
        System.out.println("Enter prinicpal amount");
        int principalAmount = input.nextInt();
        System.out.println("Enter time in years");
        float years = input.nextFloat();
        System.out.println("Enter rate of interest");
        double rate = input.nextDouble();
        double simpleInterest ;
        simpleInterest = (principalAmount * years * rate)/100;
        System.out.println(simpleInterest);
        System.out.println(".................................");

        System.out.println("Take in two numbers and operator and calculate the value");
        System.out.println("Enter number1");
        int number1 = input.nextInt();
        System.out.println("Enter number2");
        int number2 = input.nextInt();
        System.out.println("Enter operator");
        char operator = input.next().charAt(0);
        if(operator == '+'){
            System.out.println("Sum is "+(number1+number2));
        } else if(operator == '-'){
            System.out.println("Difference  is "+(number1-number2));
        } else if(operator == '*'){
            System.out.println("Multiplication is "+(number1 * number2));
        }  else {
            System.out.println("Division result is "+(number1/number2));
        }
        System.out.println(".................................");

        System.out.println("Print the largest of below 2 numbers");
        System.out.println("Enter number1");
        int number3 = input.nextInt();
        System.out.println("Enter number2");
        int number4 = input.nextInt();
        if(number3 > number4){
            System.out.println(number3+" is larger");
        } else if(number3 < number4){
            System.out.println(number4+ " is larger");
        } else {
            System.out.println("Both are equal");
        }
        System.out.println(".................................");

        System.out.println("Input currency in rupees and output in USD");
        System.out.println("Enter currency in rupees");
        double currency = input.nextDouble();
        double usd = currency/80;
        System.out.println(currency + " indian currency is equivalent to "+usd+" American currency");
        System.out.println(".................................");

        System.out.println("calculate fibonacci series upto n numbers");
        System.out.println("Enter number upto which fibonacci needs to be calculated");
        int n = input.nextInt();
        int fib1 = 0 ;
        int fib2 = 1 ;

        if( n == 1 ){
            System.out.println("Fibonnaci value is "+fib1);
        } else if ( n == 2) {
            System.out.println("Fibonacci value is "+fib2);
        } else {

            while(n >= 3  ){
                int temp = fib2;
                fib2 = fib1 + fib2;
                fib1 = temp;
                n--;
            }
            System.out.println("Fibonacci value is "+fib2);
        }
        System.out.println(".................................");

        System.out.println("Program to find out whether the string is palindrome or not");
        System.out.println("Enter the string");
        String str = input.nextLine();
        int len = str.length();
        int start = 0;
        int end = len - 1;
        boolean isPalindrome = true;
        while(start <= end){
           if(str.charAt(start) != str.charAt(end))
           {
               isPalindrome = false;
               break;
           }
           start++;
           end --;
        }

        if(isPalindrome){
            System.out.println(str+ " is a palindrome ");
        } else {
            System.out.println(str + " is not a palindrome");
        }
        System.out.println(".................................");

        System.out.println("Find whether a number is armstrong or not");
        System.out.println("Enter a number to check whether it is armstrong or not");
        int checkArmstrongNum = input.nextInt();
        // first we need to find the number of digits
        int digits = 0;
        int temp = checkArmstrongNum;
        int temp2 = checkArmstrongNum;


        while( temp != 0){
            digits++;
            temp = temp/10;
        }

        int sum = 0;
        while(temp2 != 0){
            int rem;
            rem = temp2 % 10;
            sum = (int) (sum + Math.pow((double)(rem),(double)(digits)));
            temp2 = temp2/10;
        }

        if( sum == checkArmstrongNum)
            System.out.println(checkArmstrongNum+ " is a armstrong number ");
        else
            System.out.println(checkArmstrongNum+ " is not a armstron number ");
        System.out.println(".................................");
        System.out.println("End of Assignment 2 on 30 November 2023");
    }
}