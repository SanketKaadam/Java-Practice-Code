package JAVAAndDSA.StringAndStringBuilder;

import java.util.ArrayList;

public class StringConcentrationOperator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        // java convert 'a' and 'b' into unicode or ASCII value and add it
        System.out.println("a"+"b"); // ab
        System.out.println('a'+3); // 100
        System.out.println((char)('a'+3)); // d  bcoz of casting
        System.out.println("a"+1); // a1 // here '1' is converted into wrapper class and call toString method
        // so this is same after few steps : "a"+"1"
        System.out.println("kunal"+ new ArrayList<>()); // kunal[]  returning empty array
        System.out.println("sanket"+ new Integer(56)); //sanket56
        // when it is object it call toString only
        // System.out.println(new Integer(56) + new ArrayList<>()); it will give error
        // the operator plus in java its only define for primitive and when any onr of this value is a string
        System.out.println(new Integer(56)+ "" + new ArrayList<>()); // 56[] now it work
        // condition is at least one of this object should be a type string

    }
}
