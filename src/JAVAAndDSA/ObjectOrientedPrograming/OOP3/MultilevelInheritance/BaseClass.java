package JAVAAndDSA.ObjectOrientedPrograming.OOP3.MultilevelInheritance;

public class BaseClass extends SuperBaseClass{
    int a=10;
    int b;
    int c=50;

    public void greeting(){
        System.out.println("i am base class method ");
    }

    public void display1(){
        super.greeting(); // superbase class
        greeting(); // base class
    }

    public BaseClass(){
        super();
        System.out.println("I base class constructor ");

    }
}
