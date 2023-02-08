package Telusko.AnnotationsInJava;

import java.util.ArrayList;

@FunctionalInterface // it's indicate that this interface have only one method
interface ABC{
    void oneMethod();
    // void secondMethod(); // if you add second method then it gives error
}

class A{
    public void show(){

    }

    public void showMethodFromLastYearDatabase(){
        System.out.println("i am in A");
    }

    @Deprecated
    public void Demo(){
        System.out.println("I am deprecated method");
    }
}

class B extends A{
    public void show() { // here I override method without using annotations it's work bcoz method

    }

    @Override // it indicates its override method without any error, check notes
    public void showMethodFromLastYearDatabase() {
        System.out.println("I ma in class B");
    }
}

public class AnnotationsBasic {
    @SuppressWarnings("unchecked") // it's remove warning of Generics came in ArrayList
    public static void main(String[] args) {
        ArrayList arr  = new ArrayList(); // here it gives warring to use Generics
        A obj = new A();
        obj.showMethodFromLastYearDatabase();

        A obj1 = new B();
        obj1.showMethodFromLastYearDatabase(); // it called class B method

        obj1.Demo(); // it's allow to use this method but better to not use this method, and it put line on method name which indicate it's deprecated method
    }
}
