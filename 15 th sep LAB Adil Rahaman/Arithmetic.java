// Q. write the following code :

// 1. A class named Arithmatic  with a method named add that takes integers as parameters and returns an integer denoting their sum.
// 2. A class named Adder that inherits from a superclass named Arithmaic.


import java.util.*;

public class Arithmetic {
    int x, y;
    int add(int x, int y) {
        this.x=x;
        this.y=y;
        return x+y;
    }
}

class Adder extends Arithmetic{
    public static void main(String[] args) {
        Adder addition = new Adder();
        System.out.println("your sum is = " + addition.add(10,3));
    }
}
