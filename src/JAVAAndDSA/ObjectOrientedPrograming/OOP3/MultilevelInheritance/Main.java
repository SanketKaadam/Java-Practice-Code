package JAVAAndDSA.ObjectOrientedPrograming.OOP3.MultilevelInheritance;

public class Main {
    int e=100;
    static int c=40;
    public static void main(String[] args) {
        ChildClass child = new ChildClass(); // print all three class constructor

        child.display(); // confusion why base class greeting method is not called

        child.display1(); // check again

        System.out.println("-----------------------------");

        System.out.println(child.c);
       // System.out.println(Main.c);
    }
}
