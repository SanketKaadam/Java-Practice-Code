package Telusko.Collections;
import java.util.*;

public class CollectionAndGenerics {
    public static void main(String[] args) {
        Collection values1 = new ArrayList();
        Collection values = new ArrayList(); // here we don't use generics so we can add elements of any datatype
        values.add(10);
        values.add("sanket");
        values.add(10.20);
        values.add(1000);
        values.add("sunil");
        values.add('A');
        System.out.println(values);
        values.remove(1000); // here it's using object name not index numbers bcoz collection doesn't work with index numbers so we can't add elements in between
        System.out.println(values);
        System.out.println(values.equals(15)); // don't understand equals method
        System.out.println(values.contains(10)); // if element is present in ArrayList then it print True
        values.addAll(values);
        System.out.println(values); // so it add collection list with other collection list and print whole list
        System.out.println(values1.isEmpty()); // so it checks list is empty or not

        Iterator i = values.iterator();
        System.out.println(i.next()); // it print's 1st elements from list
        System.out.println(i.next()); // it print's 2nd elements from list

        // insist of writing sout again and again we can use while or for loop eg

        while (i.hasNext()){
            System.out.println(i.next());
        } // insist of writing this also we use enhanced for loop

        for (Object  a : values){ // object bcoz we don't have any specific datatype
            System.out.println(a);
        }

        Collection<Integer> values2 = new ArrayList<>(); // here we are using Generics so only add specific datatype eg Integer here
       // values2.add("sanket"); giving error if we don't add integer values
        // here also we can use all method mention above
    }
}
