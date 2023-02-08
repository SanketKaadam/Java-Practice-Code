package JAVAAndDSA.ObjectOrientedPrograming.OOP3.HierarchalInheritance;

public class Child3 extends BaseClass{
    int a=50;
    int e=super.a;

    public void greeting(){
        System.out.println("I am child2 class method");
        System.out.println(e);
    }


    void display(){
        super.greeting();
        greeting();
    }

    Child3(){
        super();
        System.out.println("i am child1 class constructor ");
    }
}
