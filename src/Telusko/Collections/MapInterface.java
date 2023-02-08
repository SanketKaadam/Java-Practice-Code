package Telusko.Collections;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,String> obj = new HashMap<>();
        obj.put("myName","Sanket");
        obj.put("actor","Salman");
        obj.put("ceo","Elon");

        System.out.println(obj); // it's print in random sequence

        System.out.println(obj.get("ceo")); // here I pass key and it gives me value
        System.out.println(obj.get("xyz"));  // here I pass wrong key but not give error it prints null

        obj.put("myName","Navin"); // here I repeat key 'myName', so it update value of 'myName' key not create another key
        obj.put("myNameis","Sanket"); // here I repeat value but not key so it works
// Now I want to print key values in sequence then we use KeySet
        Set<String> keys = obj.keySet();
        for (String Values : keys){
            System.out.println(Values+" "+obj.get(Values));
        }

        Map<String,String> obj2 = new Hashtable<>(); // here we use HashTable it same like HashMap the difference is HashTable is synchronized and Thread safe and HashMap is not synchronize and not thread safe
    }
}
