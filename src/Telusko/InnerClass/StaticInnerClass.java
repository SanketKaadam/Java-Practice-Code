package Telusko.InnerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer1 obj = new Outer1();
        obj.j=500;

        Outer1.Inner1 obj1 = new Outer1.Inner1(); // here I don't need to object of Inner class
        obj1.display();

    }
}

class Outer1 {
    int j;

    static class Inner1 {
        public void display(){
            System.out.println("I am display method of Outer class");
        }
    }
}
