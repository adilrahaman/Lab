// Q. 2… In this example, you have a base class Teacher and a sub class ITTeacher. Since 
// class ITTeacher extends the designation and college properties and work () method from 
// base class, we need not to declare these properties and method in sub class.
// Here we have college Name, designation and work () method which are common to all the 
// teachers so we have declared them in the base class, this way the child classes like Math 
// Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used 
// directly from base class.

import java.util.*;
public class Teacher {
    String designation = "Professor";
    String collegeName = " Future Institute of Technology";
    void work() {
        System.out.println("Teaching");
    }
}

class ITTeacher extends Teacher{
    String stream = "ECE";
    String subject = "Electronics";
    public static void main(String[] args) {
        ITTeacher area = new ITTeacher();
        System.out.println(area.collegeName);
        System.out.println(area.designation);
        System.out.println(area.stream);
        System.out.println(area.subject);
        area.work();
    }
}
