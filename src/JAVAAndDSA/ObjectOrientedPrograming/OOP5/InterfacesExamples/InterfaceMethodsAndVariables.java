package JAVAAndDSA.ObjectOrientedPrograming.OOP5.InterfacesExamples;

/* public interface Demo{
} */ // in same file we can't declare class and interface as public at the same time

interface Demo{
    static final int ROLLNO = 100; // Variables in interface by default static and final
    int ROLLNO2 = 200; // no need to mention static and final its by default

    public abstract void fun(); // the methods declared in an interface are by default abstract (only method signature, no body).
    void fun2(); // no need to declare public and abstract bcoz its by default

   // private abstract void fun2(); give error, only public methods allowed
    // protected abstract void fun3(); give error, only public methods allowed
    // we will discuss this in next program
}

class TestClass implements Demo{
    @Override
    public void fun() { // methods must be public therwise it gives error
        System.out.println("i am in TestClass and i override fun method from interface ");
    }

    @Override
    public void fun2() {  // / methods must be public otherwise it gives error
        System.out.println("i am in TestClass and i override fun2 method from interface ");
    }
}

public class InterfaceMethodsAndVariables {
    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.fun();
        obj.fun2();
        System.out.println(obj.ROLLNO);
        System.out.println(obj.ROLLNO2);

        Demo obj2 = new TestClass();
        obj2.fun();
        obj2.fun2();
        System.out.println(obj2.ROLLNO);
        System.out.println(obj2.ROLLNO2);

        // both working fine
    }
}
