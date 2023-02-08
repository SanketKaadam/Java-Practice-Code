package JAVAAndDSA.StringAndStringBuilder;

public class InternalWorkingOfString {
    public static void main(String[] args) { /*
        // string is collection of character
        String name = "Sanket Kadam";
        // string is class in java that's why 'S' is capital in String
        // every string that u create it actually object of type string
        //string is immutable for security reason example
        String a = "sanket"; // here a is pointing to 'sanket' in string pool heap memory
        System.out.println(a);
        a="kadam"; // here I changed value of a that means i create new object not changing value of old object
        System.out.println(a);
        // now garbage collection remove the value of 'sanket' from string pool bcoz now no one os pointing to 'sanket'

        // String comparison
        String a1 = "sanket";
        String a2 = "sanket";
        System.out.println(a1==a2);
        String a3 = a1;
        System.out.println(a3==a1); // true bcoz a3 also pointing same object or memory address
        // '==' operator check if this two reference variables are pointing to same object or not
        String a4 = new String("sanket");
        String a5 = new String("sanket"); // here I created two new objects by using new keyword
        System.out.println(a4==a5); // false it not checking value its checking object memory address
        System.out.println((a4).equals(a5)); // true bcoz by using .equal() we check value of object not object memory address
         */
        String a6 = "kunal";
        System.out.println(a6.charAt(0)); // string methods
        // string internally work like array only but it is not array
    }
}
