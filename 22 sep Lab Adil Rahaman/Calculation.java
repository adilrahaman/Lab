// Q 2. Write a java program to illustrate Calculator class with addition, subtraction,
//  multiplication methods that can take any number of parameters to perform the operation, without using method/constructor overloading.
 

import java.util.*;

public class Calculation {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("please enter the first number : ");
    double a = sc.nextDouble();
    System.out.println("please enter the second number : ");
    double b = sc.nextDouble();

    System.out.println("your summation is = " + add (a,b));
    System.out.println("your subtraction is = " + sub (a,b));
    System.out.println("your multplication is = " + mul (a,b));
   } 

   public static double add (double a , double b) {
      return a+b;
   }

   public static double sub (double a , double b) {
      if (b>=a){
         return b-a;
      }
      else {
         return a-b;
      }
   }

   public static double mul (double a , double b) {
      return a*b;
   }
}
