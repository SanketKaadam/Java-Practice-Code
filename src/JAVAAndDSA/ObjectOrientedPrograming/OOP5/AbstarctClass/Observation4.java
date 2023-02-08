package JAVAAndDSA.ObjectOrientedPrograming.OOP5.AbstarctClass;

abstract  class Base4{

    /* abstract final void fun1(){

    } */  // we can't use abstract and final at the same time
    // bcoz abstract method need to override and final methods is prevented to override
    final void fun(){
        System.out.println("I am final method of base class");
    }
}

class Derived4 extends Base4{
   /* void fun(){

    } */  // error bcoz final methods not override
}

public class Observation4 {
    public static void main(String[] args) {
        Derived4 obj = new Derived4();
        obj.fun();

        Base4 obj2 = new Derived4();
        obj2.fun();
    }
}
