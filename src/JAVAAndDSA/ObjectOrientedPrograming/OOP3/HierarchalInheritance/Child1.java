package JAVAAndDSA.ObjectOrientedPrograming.OOP3.HierarchalInheritance;

public class Child1 extends BaseClass{
    int a=20;
    int c;

    public void greeting(){
        System.out.println("I am child1 class method");
    }

    void display(){
        super.greeting();
        greeting();
    }

    Child1(){
        super();
        System.out.println("i am child1 class constructor ");
    }
}
