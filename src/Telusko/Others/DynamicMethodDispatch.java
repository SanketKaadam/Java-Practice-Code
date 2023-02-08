package Telusko.Others;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj1 = new A(); // create object of class A
        B obj2 = new B(); // create object of class B

        A a;  // here only declare object a of class A
        a=obj2; // assign obj2 value in a

        a.show(); // call class B show method

        // Dynamic dispatch decide which method to run at run time
        // Dynamic dispatch also called runtime polymorphism
    }
}

class A{
    public void show(){
        System.out.println("In class A show method");
    }
}

class B extends A{
    public void show(){
        System.out.println("In class B show method");
    }
}
