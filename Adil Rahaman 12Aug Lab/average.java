// Q.1 
// Write a Java program that takes five numbers as input to calculate and print 
// the average of the numbers.

import java.util.*;
class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers do you want to average :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        System.out.println("please enter your "+ n + " numbers : ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        
        float avg = sum / (float) n;
        System.out.printf(" your avg of "+ n + " numbers is = " + "%.3f", avg);
    }
    
    }