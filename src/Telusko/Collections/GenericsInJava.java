package Telusko.Collections;

import java.util.*;

public class GenericsInJava {
    public static void main(String[] args) {
        List values = new ArrayList();
        values.add("Navin");
        values.add(100);
        values.add(10.20);
      //  int i = Integer.parseInt(values.get(0).toString()); // it gives error at runtime
        // to handle type safety we use generics and at compile time we solve datatype error

        CustomGenericClass<Number> obj = new CustomGenericClass<>();
        obj.value=9;
        obj.show();
        obj.demo(new ArrayList<Integer>());

        CustomGenericClass<Number> obj2 = new CustomGenericClass<>();
    }
}

class CustomGenericClass <T extends Number>{ // Now we only that class which extends Number class eg Wrapper classes
    T value;

    public void show(){
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? extends T> obj){

    }

    public void demo2(ArrayList<? super T> obj){

    }
}