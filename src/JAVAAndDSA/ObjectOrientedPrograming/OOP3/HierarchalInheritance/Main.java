package JAVAAndDSA.ObjectOrientedPrograming.OOP3.HierarchalInheritance;

public class Main {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        ch1.display();
        System.out.println(ch1.a);
        System.out.println("------------------------------------");

        Child2 ch2 = new Child2();
        ch2.display();
        System.out.println(ch2.a);
        System.out.println("------------------------------------");

        Child3 ch3 = new Child3();
        ch3.display();
        System.out.println(ch3.a);
        System.out.println("------------------------------------");
    }
}
