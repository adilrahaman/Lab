import java.util.*;
public class fibonacciSeries {
    public static void fib(int n) {
        System.out.println("your fibonacci series is : ");
        int x=0;
        int y=1;
        int z=0;
        for (int i=1; i<=n; i++) {

            if (i<2) {
                System.out.print(z +" ");
            }
        
            else {
                z=x+y;
                y=x;
                x=z;
                System.out.print(z+" ");
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter a how many terms you want in fibonacci series : ");
        int n = sc. nextInt();
        if (n>0) {
            fib(n);
        }
        else {
            System.out.println("please enter a valid input.");
        }
    }
}