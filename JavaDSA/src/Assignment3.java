import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


     /*   Area Of Circle Java Program
        Area Of Triangle
        Area Of Rectangle Program
        Area Of Isosceles Triangle
        Area Of Parallelogram
        Area Of Rhombus
        Area Of Equilateral Triangle
        Perimeter Of Circle
        Perimeter Of Equilateral Triangle
        Perimeter Of Parallelogram
        Perimeter Of Rectangle
        Perimeter Of Square
        Perimeter Of Rhombus
        Volume Of Cone Java Program
        Volume Of Prism
        Volume Of Cylinder
        Volume Of Sphere
        Volume Of Pyramid
        Curved Surface Area Of Cylinder
        Total Surface Area Of Cube

      */

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the shape to which you want to measure");
        String shape = input.next();

     /*   switch (shape) {
            case "circle": {
                System.out.println("Enter radius");
                int radius = input.nextInt();

                System.out.println("What do you want to calculate Area or Perimeter");
                char ip = input.next().trim().charAt(0);
                switch (ip) {
                    case 'p':
                        System.out.println("Perimeter of circle  with radius " + radius + " is " + (2 * 3.14 * radius));
                        break;

                    default:
                        System.out.println("Area of circle with radius " + radius + " is " + (3.14 * radius * radius));
                }
            }
            break;

            case "rectangle": {
                System.out.println("Enter length and breadth of rectangle");
                int length = input.nextInt();
                int breadth = input.nextInt();
                System.out.println("What do you want to calculate Area or Perimeter");
                char ip = input.next().trim().charAt(0);

                switch (ip) {
                    case 'p':
                        System.out.println("Perimeter of the rectangle with" + length + " and " + breadth + " is " + (2 * (length + breadth)));
                        break;

                    default:
                        System.out.println("Area of the rectangle with" + length + " and " + breadth + " is " + (length * breadth));
                }
            }
            break;
            case "triangle": {
                System.out.println("Enter type  of triangle");
                String typeOfTriangle = input.next().trim();

                switch (typeOfTriangle) {
                    case "equilateral": {
                        System.out.println("Enter side of triangle");
                        int side = input.nextInt();

                        System.out.println("What do you want to calculate Area or Perimeter");
                        char ip = input.next().trim().charAt(0);

                        switch (ip) {
                            case 'p':
                                System.out.println("Perimeter of equilateral traingle with side " + side + " is " + (3 * side));
                                break;

                            default:
                                System.out.println("Area of equilateral traingle with side " + side + " is " + (Math.pow(3, 0.5) * side * side) / 4);
                        }
                    }
                    break;

                    default: {
                        {
                            System.out.println("Enter  three sides of triangle");
                            int sideA = input.nextInt();
                            int sideB = input.nextInt();
                            int sideC = input.nextInt();
                            System.out.println("What do you want to calculate Area or Perimeter");
                            char ip = input.next().trim().charAt(0);

                            switch (ip) {
                                case 'p':
                                    System.out.println("Perimeter of  traingle with the above given sides is " + (sideA + sideB + sideC));
                                    break;

                                default: {
                                    double semiPerimeter = (sideA + sideB + sideC) / 2;
                                    System.out.println("Area of  traingle with the above given sides is " + (Math.pow(semiPerimeter * (semiPerimeter - sideC) * (semiPerimeter - sideA) * (semiPerimeter - sideB), 0.5)));
                                }
                            }
                        }
                    }

                }
            }
            break;

            case "parallelogram": {
                System.out.println("Enter base and height of parallelogram");
                int base = input.nextInt();
                int height = input.nextInt();

                System.out.println("What do you want to calculate Area or Perimeter");
                char ip = input.next().trim().charAt(0);
                switch (ip) {
                    case 'p':
                        System.out.println("Perimeter of parallelogram with given base and height is  ignored due to mathematical constraints");
                        break;

                    default:
                        System.out.println("Area of parallelogram with base " + base + " and " + " height " + height + " is " + (base * height));
                }
            }
            break;

            case "rhombus": {
                System.out.println("Enter diagonal 1 and diagonal 2  of Rhombus");
                int diagonal1 = input.nextInt();
                int diagonal2 = input.nextInt();

                System.out.println("What do you want to calculate Area or Perimeter");
                char ip = input.next().trim().charAt(0);
                switch (ip) {
                    case 'p':
                        System.out.println("Perimeter of rhombus with given diagonals  is  " + (2 * Math.pow((diagonal1 * diagonal1) + (diagonal2) * diagonal2, 2)));
                        break;

                    default:
                        System.out.println("Area of parallelogram with diagonal1 " + diagonal1 + " and " + " diagonal2 " + diagonal2 + " is " + (0.5 * diagonal1 * diagonal2));
                }
            }
            break;

            //  skipping remaining problems related due to mensuration  because of repetitiveness
        }

      */

          /*
        Fibonacci Series In Java Programs
        Subtract the Product and Sum of Digits of an Integer
        Input a number and print all the factors of that number (use loops).
        Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Take integer inputs till the user enters 0 and print the largest number from all.
        Addition Of Two Numbers */

        //fibonacci series already executed

      /*  System.out.println("Subtract the Product and Sum of Digits of an Integer");
        System.out.println("Enter a number");
        int num = input.nextInt();
        int productOfDigits = 1;
        int sumOfDigits = 0;

        while(num != 0){
            sumOfDigits += num%10;
            productOfDigits *= num%10;
            num = num/10;
        }
        System.out.println("Difference is "+(productOfDigits - sumOfDigits));
        System.out.println("............................................");

        System.out.println("Input a number and print all the factors of that number (use loops)");
        System.out.println("Enter a number");
        int num2 = input.nextInt();
        System.out.println("Factors are :");
        for( int i= 1;  i <= (int)Math.pow(num2,0.5); i++){
            if( num2 % i == 0){
                System.out.println( i );
                System.out.println( num2 / i);
            }
        }
        System.out.println("............................................");

        System.out.println("Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)");

        int sum = 0;
        int max = Integer.MIN_VALUE;
        while( true) {
            System.out.println("Enter a number");
            int num3 = input.nextInt();
            if(num3 == 0) {
                System.out.println("sum is "+sum);
                System.out.println("max is "+max);
                break;
            }
            else {
                if(max < num3)
                    max = num3;
                sum+=num3;
            }
        }
        System.out.println("............................................");

        System.out.println("Addition Of Two Numbers until user enters first number as 0");

        while(true){

            System.out.println("Enter number1 ");
            int number1 = input.nextInt();

            if( number1 == 0) {
                System.out.println("Exit from the program");
                break;
            }
            else {
                System.out.println("Enter number2");
                int number2 = input.nextInt();

                System.out.println("Sum is "+(number1 + number2));
            }
        }

       */

         /*
        Intermediate Java Programs
        Factorial Program In Java
        Calculate Electricity Bill
        Calculate Average Of N Numbers
        Calculate Discount Of Product
        Calculate Distance Between Two Points
        Calculate Commission Percentage
        Power In Java
        Calculate Depreciation of Value
        Calculate Batting Average
        Calculate CGPA Java Program
        Compound Interest Java Program
        Calculate Average Marks
        Sum Of N Numbers
        Armstrong Number In Java
        Find Ncr & Npr
        Reverse A String In Java
        Find if a number is palindrome or not
        Future Investment Value
        HCF Of Two Numbers Program
        LCM Of Two Numbers
        Java Program Vowel Or Consonant
        Perfect Number In Java
        Check Leap Year Or Not
        Sum Of A Digits Of Number
        Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
        Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.


       */
        System.out.println("Factorial program in java");
        System.out.println("Enter a number");
        int factNumber = input.nextInt();
        long factResult = 1;
        while( factNumber> 0){
            factResult *= factNumber;
            factNumber--;
        }
        System.out.println("Factorial of given number is "+factResult);
        System.out.println("..............................");

        System.out.println("Electricity bill ");
        /* let us assume category 1 - 100 units is 1 rs/unit, category above 100 - 200 units is 2 rs/unit , above 200 units evry unit is charged 3 per unit */
        System.out.println("Electricity units charged");
        int units = input.nextInt();
        int price ;

        if( units < 100) {
            price =  units ;
        }
        else if( units > 100 && units < 200){
            price = 100 + (units - 100) * 2;
        }
        else {
            price = 100 + 200 + (units - 200) * 3;
        }
        System.out.println("electricity bill for units "+units + " is "+price);
        System.out.println("..............................");

        System.out.println("Calculate average of n numbers");
        System.out.println("Enter number of integers required");
        int n = input.nextInt();
        int temp1 = n;
        int sum = 0;
        while( n > 0){
            System.out.println("Enter the number");
            int enteredNum = input.nextInt();
            sum+=enteredNum;
            n--;
        }
        System.out.println("Average of entered "+ temp1+" numbers is"+(sum/temp1));

        // skipping discount of product
        // distance bewteen two points
        // comission percentage

        System.out.println("Calculate power in java");
        System.out.println("Enter number for which power to be calculated");
        int base = input.nextInt();
        System.out.println("Enter to which power base to be calculated");
        int power = input.nextInt();
        int powerRes = 1;
        while(power > 0) {
            powerRes *= base;
            power --;
        }
        System.out.println(powerRes);
        System.out.println(".........................");

        // skipping below programs
        // Compound Interest Java Program
        //        Calculate Average Marks
        //        Sum Of N Numbers
        //        Armstrong Number In Java
        //        Find Ncr & Npr
        // Reverse a string

        System.out.println("Find if a number is palindrome or not");
        int checkPalindromeNumber = input.nextInt();
        int temp = checkPalindromeNumber;
        boolean isPalindrome = false;
        // aiming for worst case
        //find reverse of a number and check
        int rev = 0 ;
        while( temp != 0) {
            rev = rev * 10 + (temp%10) ;
            temp = temp/10;
        }
        if(rev == checkPalindromeNumber)
            System.out.println(" Given number is palindrome");
        else
            System.out.println(" Given number is not a palindrome ");
        System.out.println("......................");

        //hcf and lcm of two numnbers is done in previous assignment
        System.out.println("Write a java program to check whether it is vowel or consonant");
        System.out.println("Enter a character");
        char ch = input.next().trim().charAt(0);
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch=='u')
            System.out.println(ch+" is a vowel ");
        else
            System.out.println(ch+" is a consonant ");
        System.out.println("....................");

        //skipping these
//        Perfect Number In Java
//        Check Leap Year Or Not
//        Sum Of A Digits Of Number
//      Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

        System.out.println(" Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.");
        System.out.println("Start entering the numbers . Zero will stop entering the numbers and gives the result");
        int negSum = 0;
        int posEvenSum = 0;
        int posOddSum = 0;
        while(true){
            System.out.println("Enter the number");
            int entry = input.nextInt();
            if(entry == 0){
                System.out.println("Terminating entry of integers");
                break;
            }
            else if( entry < 0) {
                negSum+=entry;
            } else if(entry%2 == 0){
                posEvenSum+= entry;
            }  else {
                posOddSum+= entry;
            }

        }
        System.out.println(" even sum is "+posEvenSum);
        System.out.println(" odd sum is "+posOddSum);
        System.out.println(" neg sum is "+negSum);
        System.out.println(".....................End of Assignment 3...........................");

    }
}
