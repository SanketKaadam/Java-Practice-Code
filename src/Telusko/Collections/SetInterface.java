package Telusko.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> obj = new HashSet<>();
        obj.add(100);
        obj.add(300);
        obj.add(200);
        obj.add(400);
        obj.add(150);
        obj.add(100); // here I am adding duplicate element but in output it not showing

        System.out.println(obj); // it not print element in sequence
        // to show elements in ascending order sequence we use HashTree

        Set<Integer> obj1 = new TreeSet<>();
        obj1.add(10);
        obj1.add(30);
        obj1.add(20);
        obj1.add(40);
        obj1.add(15);
        obj1.add(10); // in TreeSet also duplicate values not add
        System.out.println(obj1); // now it print in ascending order sequence

    }
}
