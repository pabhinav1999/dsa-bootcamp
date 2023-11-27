import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno = 64;
        char name = 'a';
        float marks = 98.67f;
        double double1 = 965784930.98273 ;
        long largeInteger = 6867949409959L;

        //automatic type conversion
//        int input1 = (int)input.nextFloat();
        float input2 = input.nextInt();
        System.out.println(input2);

        byte b = (byte)(257);
        System.out.println(b);

        byte m = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f*b) + (i/c) - (d*s);
        System.out.println(result);

    }
}