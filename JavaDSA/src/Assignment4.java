import java.util.Scanner;

/*
 # [Video Link](https://youtu.be/vvanI8NRlSI)

1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.](https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)

2. [Define a program to find out whether a given number is even or odd.](https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/)

3. [A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.](https://www.efaculty.in/java-programs/voting-age-program-in-java/)

4. [Write a program to print the sum of two numbers entered by user by defining your own method.](https://code4coding.com/addition-of-two-numbers-in-java-using-method/)

5. [Define a method that returns the product of two numbers entered by user.](https://code4coding.com/java-program-to-multiply-two-numbers-using-method/)

6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.](https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/)

7. [Define a method to find out if a number is prime or not.](https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)

8. [Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
<pre>
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
</pre>

9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.](https://www.javatpoint.com/factorial-program-in-java)
Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- <br/>
<pre>
4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1
</pre>

10. [Write a function to find if a number is a palindrome or not. Take number as parameter.](https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/)

11. Convert the programs in [flow of program](01-flow-of-program.md), [first java](02-first-java.md), [conditionals & loops](03-conditionals-loops.md) assignments into functions.

12. [Write a function to check if a given triplet is a Pythagorean triplet or not.](https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/) (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

13. [Write a function that returns all prime numbers between two given numbers.](https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/)

14. [Write a function that returns the sum of first n natural numbers.](https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/)
 */
public class Assignment4 {
   static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Find max and min of three");
        System.out.println("Enter three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        findMax(a,b,c);
        findMin(a,b,c);
        System.out.println("Define a program to find out whether a given number is even or odd.");
        System.out.println("................................");
        System.out.println("Enter the number");
        int checkEvenOrOdd = input.nextInt();
        System.out.println(isEvenOrOdd(checkEvenOrOdd));
        System.out.println("................................");
        System.out.println("A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote");
        System.out.println("Enter the age");
        int age = input.nextInt();
        System.out.println("The fact of person with age "+age+" can vote is "+ isEligibleToVote(age));
        System.out.println("................................");
        System.out.println("Write a program to print the sum of two numbers entered by user by defining your own method.");
        sum();
        System.out.println("................");
        System.out.println("Define a method that returns the product of two numbers entered by user.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(product(num1,num2));
        System.out.println("............................");
        System.out.println("Write a program to print the circumference and area of a circle of radius entered by user by defining your own method");
        mensurationOfCircle();
        System.out.println("............................");
        System.out.println("Testing arguments functions");
        int arr[] = {9,8,67};
        System.out.println(sum(5,4,arr));

        //skipping remaining all questions due to repetitiveness
        //trying with array arguments



    }

    static void mensurationOfCircle() {
        System.out.println("Enter radius");
        int radius = input.nextInt();
        System.out.println("Circumference is "+(2 * Math.PI * radius));
        System.out.println("Area is "+(Math.PI * radius * radius));
    }


    static int product(int num1, int num2) {
        return num1 * num2;
    }

    static void sum() {
        System.out.println("Enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(" Sum of two numbers "+a+" and  "+b+" is "+(a+b));

    }

    static boolean isEligibleToVote(int age) {
        return age >= 18;
    }



    static String isEvenOrOdd(int checkEvenOrOdd) {
        return checkEvenOrOdd%2 == 0 ? (checkEvenOrOdd+" is a even number"):(checkEvenOrOdd+" is a odd number");
    }

    static void findMax(int a, int b, int c){
        int max = Integer.MIN_VALUE;
        if( a > max ) {
            max = a;
        }

        if( b > max ){
            max = b;
        }

        if( c > max ){
            max = c;
        }

        System.out.println("Maximum value is "+max);
    }
    static void findMin(int a, int b, int c){

        int min= Integer.MAX_VALUE;
        if( a < min ) {
            min = a;
        }

        if( b < min ){
            min = b;
        }

        if( c < min ){
            min = c;
        }
        System.out.println("Minimum value is "+min);
    }

    static int sum(int a, int b,int  ...v){
        int sum = a + b + v[2];
        return sum;
    }
}
