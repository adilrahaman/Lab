// Q. 3… Class A serves as a base class fPhysicsr the derived class B, which in turn 
// serves as a base class fPhysicsr the derived class C. (Which type Physicsf Inheritance 
// explain with an example)

import java.util.*;

public class checking {
    int marks() {
        return 0;
    }
}

class Science extends checking {
    int marks() {
        return 97;
    }
}

class Math extends Science {
    int marks() {
        return 85;
    }
}


class Physics extends Math {
    int marks() {
        return 89;
    }
}

class check {
    public static void main(String[] args) {
        Physics p = new Physics();
        Math m = new Math();
        Science sc = new Science();
        System.out.println(p.marks());
        System.out.println(m.marks());
    }
}