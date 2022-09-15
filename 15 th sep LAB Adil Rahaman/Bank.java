// Q. 4…Consider a scenario where Bank is a class that provides functionality to get the rate 
// of interest. However, the rate of interest varies according to banks. For example, SBI, 
// ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.


import java.util.*;
public class Bank {
    int getRateOfInterest () {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest () {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest () {
        return 7;
    }
}

class AXIS extends Bank {
    int getRateOfInterest () {
        return 9;
    }
}

class execute {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("rate of interest of SBI is :" + sbi.getRateOfInterest() + " %");
        System.out.println("rate of interest of ICICI is :" + icici.getRateOfInterest() + " %");
        System.out.println("rate of interest of AXIS is :" + axis.getRateOfInterest() + " %");
    }
}


