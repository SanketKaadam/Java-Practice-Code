package JAVAAndDSA.ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        for (int i=0; i<5; i++){
            list.add(input.nextInt());
        }

        // print Arraylist
        for (int i=0; i<5; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list); // directly print ArrayList

        ArrayList<Integer> list2 = new ArrayList<>(5);
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        System.out.println(list2);
        list2.set(2,500);
        System.out.println(list2);
        System.out.println(list2.contains(500));
        list2.remove(4);
        System.out.println(list2);

    }
}
