package JAVAAndDSA.ObjectOrientedPrograming.OOP3.HierarchalInheritance;

public class Child2 extends BaseClass{
    int a=40;
    int d;

    public void greeting(){
        System.out.println("I am child2 class method");
    }

    void display(){
        super.greeting();
        greeting();
    }

    Child2(){
        super();
        System.out.println("i am child1 class constructor ");
    }
}
