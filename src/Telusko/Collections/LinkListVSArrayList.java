package Telusko.Collections;

import java.util.LinkedList;

public class LinkListVSArrayList {
    public static void main(String[] args) {
        // ArrayList work with index number and LinkList don't work with index number
        // LinkList use previous node and next node address concept so it fast to add or remove elements in between

        LinkedList<Integer> obj = new LinkedList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        System.out.println(obj);
        obj.add(3,100);
        System.out.println(obj);
        System.out.println(obj.get(4));
    }
}
