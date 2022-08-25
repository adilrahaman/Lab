
// Q 3 . Write a java program to print pyramid pattern using "*" . 

import java.util.*;

public class numberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please entera value :");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();

            for ( int j=n; j>i; j--) {
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++) {
                System.out.print( "*" + " ");
            }
        }
    }
}
