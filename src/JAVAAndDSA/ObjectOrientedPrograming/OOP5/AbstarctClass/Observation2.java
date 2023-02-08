package JAVAAndDSA.ObjectOrientedPrograming.OOP5.AbstarctClass;

abstract class Base2{
    Base2(){
        System.out.println("Base class constructor called");
    }
}

class Derived2  extends Base2{
    Derived2(){
        System.out.println("Derived class constructor called");
    }

    public void fun(){
        System.out.println("I am derived class normal method");
    }
}

public class Observation2 {
    public static void main(String[] args) {
        Derived2 d = new Derived2();
        d.fun();

        System.out.println("-----------------");

        Base2 b = new Derived2();
       // b.fun(); unable to call derived normal method
    }
}
