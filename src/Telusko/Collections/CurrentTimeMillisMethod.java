package Telusko.Collections;

import java.util.ArrayList;

public class CurrentTimeMillisMethod {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> obj = new ArrayList<>();
        for (int i=1; i<1000000; i++){
            obj.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end-start); // it prints time in millisecond

        long value = System.currentTimeMillis();
        System.out.println(value); // it prints time in millisecond from 1st jan 1970
    }
}
