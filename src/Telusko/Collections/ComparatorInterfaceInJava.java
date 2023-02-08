package Telusko.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceInJava {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>();
        obj.add(305);
        obj.add(458);
        obj.add(569);
        obj.add(402);
        obj.add(997);
        obj.add(101);

        /*
        Comparator<Integer> c = new CustomClass();
        Collections.sort(obj,c);
        System.out.println(obj);

        Comparator<Integer> d = new Comparator<>() { // here we use anonymous object logic
            public int compare(Integer o1, Integer o2) {
                if (o1 %100>o2 %100){ // %100 mens now it sort by using last two digit
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(obj,d);
        System.out.println(obj);

        Comparator<Integer> e = (o1 , o2)-> { // here we use lambada expression
            if (o1%10>o2%10)
                return 1;
            return -1;
        };
        Collections.sort(obj,e);
        System.out.println(obj); */

        Comparator<Integer> e = (o1 , o2)-> {
            return o1%10>o2%10?1:-1; // here we use ternary operator
        };
        Collections.sort(obj,e);
        System.out.println(obj);
    }
}

class CustomClass implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1%100>o2%100){ // %100 mens now it sort by using last two digit
            return 1;
        }
        return -1;
    }
}
