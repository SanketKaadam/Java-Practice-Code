package Telusko.Collections;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>();
        obj.add(20);
        obj.add(10);
        obj.add(15);
        System.out.println(obj);
        obj.add(2,30); // here i able to add element in between bcoz List work with index Numbers
        System.out.println(obj);
        Collections.sort(obj); // here we sort elements by using sort() methods
        obj.forEach(System.out :: println); // here we use Stream API to print elements
    }
}
