package Telusko.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintingDuplicateElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(100);
        obj.add(200);
        obj.add(300);
        obj.add(400);
        obj.add(100); // here i add duplicate element
        obj.add(600);
        obj.add(200);

        Set<Integer> obj2 = new HashSet<>();
        for (int values : obj){
            if (obj2.add(values)==false){
                System.out.println(values);
            }
        }
    }
}
