package JAVAAndDSA.ObjectOrientedPrograming.OOP2;

public class PackageA {
    public static void main(String[] args) {
        greeting("Sanket");
        greeting2("Kunal");
    }

    static void greeting(String name){ // here I don't use public because both classes in same package, mention static because we call this method in main static method
        System.out.println("Good morning! "+name);
    }

    public static void greeting2(String name){ // here I use public because now I am calling this method in TestPackage Class 'C', mention static because we call this method in main static method
        System.out.println("Good morning! "+name);
    }
}
