package JAVAAndDSA.Vector;

import java.util.Vector;

public class VectorCode {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(); // <Integer> is generic

        v.add(10);

        System.out.println(v.capacity()); // initial capacity is 10

        v.add(11);
        v.add(12);
        v.add(13);
        v.add(14);
        v.add(15);
        v.add(16);
        v.add(17);
        v.add(18);
        v.add(19);
        v.add(20);
        v.add(21);
        v.add(22);

        System.out.println(v);

        System.out.println(v.capacity()); // now here initial capacity is 20, increase by 100%

        // Vector is similar like ArrayList, there are 3 differences between them

        // 1. If initial capacity is full then vector increase its capacity by 100% and ArrayList increase its capacity by 50%
        // 2. Vector is Thread safe and Synchronize where ArrayList is not synchronize and thread safe
        // 3. vector is slow as compare to ArrayList

    }
}
