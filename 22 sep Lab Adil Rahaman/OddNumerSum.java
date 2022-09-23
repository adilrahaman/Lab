// Q 1. write a java program to print sum of odd numbers up to N?


import java.util.*;
public class OddNumerSum {
    public static void main(String[] args) {
        System.out.println("please enter the limit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for ( int i = 1; i<=n ; i++) {
            if (i%2 !=0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("sum of odd numbers = " + sum);
    }
}
