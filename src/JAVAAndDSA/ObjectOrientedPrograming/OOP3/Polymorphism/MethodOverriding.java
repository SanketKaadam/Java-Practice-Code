package JAVAAndDSA.ObjectOrientedPrograming.OOP3.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        BaseClass bs = new BaseClass();
        bs.greeting("sanket"); // overriding method calling base class method
        bs.display();
        System.out.println(bs.a);

        System.out.println("---------------------------------");
        BaseClass cc = new ChildClass();
        cc.greeting("sanket"); // here it call child class method
        cc.display(); // extended method
        System.out.println(cc.a); // here he accesses base class variable
    }
}
