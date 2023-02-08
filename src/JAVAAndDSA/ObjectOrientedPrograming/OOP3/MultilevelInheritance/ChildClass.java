package JAVAAndDSA.ObjectOrientedPrograming.OOP3.MultilevelInheritance;

public class ChildClass extends BaseClass{
    int d=20;
    int c=30;

    public void greeting(){
        System.out.println("i am child class method ");
    }

    public void display() {
       // super.greeting(); //only print base class method
        super.display1(); // print superbase and base class methods
        //greeting(); // child class
    }

    ChildClass(){
        super();
        System.out.println("i am child class constructor");
    }
}
