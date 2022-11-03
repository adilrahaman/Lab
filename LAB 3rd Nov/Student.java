// Q.1 >> wrappers in java activity :


public class Student {
    public void calculateFeesStructure(long studentId, char studentGrade, double monthlyFees, boolean isScholarshipEligible) {
        // Problem Statement 1:

        if (studentId!=0 && studentGrade == 'A' && isScholarshipEligible == true) {
            double fees =  monthlyFees - monthlyFees *10/100;
            System.out.println("10% of fees is exempted, the calculated fees is " + (int)fees);
        }

        else if (studentId!=0 && studentGrade == 'B' && isScholarshipEligible == true) {
            double fees =  monthlyFees - monthlyFees *8/100;
            System.out.println("8% of fees is exempted, the calculated fees is " + (int)fees);
        }

        else if (studentId!=0 && studentGrade == 'C' && isScholarshipEligible == true) {
            double fees =  monthlyFees - monthlyFees *6/100;
            System.out.println("6% of fees is exempted, the calculated fees is " + (int)fees);
        }

        else if (studentId!=0 && studentGrade == 'D' && isScholarshipEligible == true) {
            double fees =  monthlyFees - monthlyFees *4/100;
            System.out.println("4% of fees is exempted, the calculated fees is " + (int)fees);
        }

        else {
            System.out.println("Not Eligible for Exemption");
        }
    }

    // Problem Statement 2:
    public void compareMarks (long Maths, double English) {

        if ((int)English > (int)Maths) {
            System.out.println("English marks is higher than Maths");
        }

        else if ((int)Maths > (int)English) {
            System.out.println("Maths marks is higher thn English");
        }

        else if ((int) English == (int)Maths) {
            System.out.println("Both are equal");
        }
    }

    // Problem Statement 3:
    public void validateFees(Double Fees) {
        if (Fees.isInfinite()) {
            System.out.println("Fees is infinite");
        }
        else {
            System.out.println("Fees is not infinite");
        }
        System.out.println(Fees.byteValue());
    }


    public static void main(String[] args) {
        Student student = new Student();

        student.calculateFeesStructure(234, 'C', 600, true);
        student.calculateFeesStructure(115, 'B', 909.50, true);
        student.calculateFeesStructure(980, 'G', 1810, false);

        student.compareMarks(85, 65);
        student.compareMarks(56, 98);
        student.compareMarks(84, 84);
        
        student.validateFees(100d);
    }
}


