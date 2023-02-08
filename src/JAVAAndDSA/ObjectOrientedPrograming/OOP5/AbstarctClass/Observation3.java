package JAVAAndDSA.ObjectOrientedPrograming.OOP5.AbstarctClass;

abstract class Base3{
     void fun(){
        System.out.println("I am Base class not abstract method");
    }
}

class Derived3 extends Base3{


    // not any method or variable
}

public class Observation3 {
    public static void main(String[] args) {
        Derived3 obj = new Derived3();
        obj.fun();


       // Base obj2 = new Base(); give error bcoz base class is abstract we can't create object of abstract class

        Base3 obj3 = new Derived3();
        obj3.fun(); // this also worked

    }
}
