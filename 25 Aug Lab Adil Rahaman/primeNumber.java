
// Q 2 . Write a java code to check whether a anumber is prime or not.

import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter a number to check it is prime or not : ");
        int n = sc.nextInt();
        int j = 0;

        for (int i=2; i <=n/2; i++) {
            if (n % i == 0) {
                j++;
            }
        }
        if (j == 0 && n !=1) {
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }
    }
}
