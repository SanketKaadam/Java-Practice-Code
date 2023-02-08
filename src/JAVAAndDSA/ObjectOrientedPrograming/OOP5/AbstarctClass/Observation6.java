package JAVAAndDSA.ObjectOrientedPrograming.OOP5.AbstarctClass;

abstract class Base6{
    static void fun(){
        System.out.println("I am static method of base class");
    }
}

class Derived6 extends Base6{
    /* void fun(){

    } */ // we can't override fun method bcoz it's static in base class
}

public class Observation6 {
    public static void main(String[] args) {
        Base6.fun(); // object is not needed to class fun method bcoz of static

    }
}
