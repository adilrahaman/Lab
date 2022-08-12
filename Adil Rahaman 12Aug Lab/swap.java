// Q.2
// Java: Swapping two variables


import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter your first number : ");
        int a = sc.nextInt();
        System.out.println("please enter your second number : ");
        int b = sc.nextInt();
        int store = a;
        a = b;
        b = store;

        System.out.println("after swapping the first number is = "+ a + ", and second number is = " + b);
    }
}
