// Q.5
// Write a Java program to print the sum (addition), multiply, subtract, divide and 
// remainder of two numbers.

import java.util.*;
public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your first number : ");
        int x = sc.nextInt();
        System.out.println("enter your second number : ");
        int y = sc.nextInt();

        System.out.println("your sum is  = " + (x+y));
        System.out.println("your subtraction is  = " + (x-y));
        System.out.println("your multiplication is  = " + (x*y));
        System.out.println("your division is  = " + (x/ (float) y));
    }
}
