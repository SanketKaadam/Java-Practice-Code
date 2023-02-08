package Telusko.FileHandaling;

import java.util.Arrays;

class Test{
    public void show(){
        System.out.println("i am show method of class test");
    }
}

public class MoreMethodsOfclassClass {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Telusko.FileHandaling.Test");
        System.out.println(c.isInterface());
        System.out.println(c.getSuperclass());
        System.out.println(c.getMethods());
        System.out.println(c.getName());
    }
}
