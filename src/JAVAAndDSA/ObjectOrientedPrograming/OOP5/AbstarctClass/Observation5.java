package JAVAAndDSA.ObjectOrientedPrograming.OOP5.AbstarctClass;

abstract class Base5{
    abstract void fun();
}

class Derived5 extends Base5{
    void fun(){
        System.out.println("i am derived class method");
    }
}

public class Observation5 {

    public static void main(String[] args) {
      //  Base5 obj = new Base5(); for abstract class instantiation is not possible.
        // obj.fun(); error
    }
}
