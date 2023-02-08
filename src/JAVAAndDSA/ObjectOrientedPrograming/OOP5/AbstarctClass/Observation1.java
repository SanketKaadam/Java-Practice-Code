package JAVAAndDSA.ObjectOrientedPrograming.OOP5.AbstarctClass;

// all observations learn from GreekForGreek

abstract class Base1{
    abstract void fun();
}

class Derived1 extends Base1{
    void fun(){
        System.out.println("I am derived class fun method");
    }
}

public class Observation1 {
    public static void main(String[] args) {
        Base1 b = new Derived1();
        b.fun();
    }
}
