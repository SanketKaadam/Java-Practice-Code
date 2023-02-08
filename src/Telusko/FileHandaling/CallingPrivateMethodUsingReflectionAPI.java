package Telusko.FileHandaling;

import java.lang.reflect.Method;

class A{
    private void show(){
        System.out.println("I am in show method");
    }
}

public class CallingPrivateMethodUsingReflectionAPI {
    public static void main(String[] args) throws Exception {
        // A obj = new A();
       // obj.show(); it is not allowing to call

        Class c = Class.forName("Telusko.FileHandaling.A");

        A obj = (A)c.newInstance();
        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(obj,  null);


    }
}
