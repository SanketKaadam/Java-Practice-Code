package Telusko.EnumPackage;
import java.lang.*;

class MyClass{

}
// enum MobileBrand1 extends MyClass{ } we can't extend other classes in enum, enum only extends Enum class by default

interface MyInterface{

}

enum MobileBrand2 implements MyInterface{} // this work, we implement other interfaces in enum
enum MobileBrand{
    APPLE(100),SAMSUNG,HTC(90); // we can directly assign value here for that we need to create constructor which take one parameter
    int price;
     MobileBrand(){ // creating constructor in enum to assigning value
        price=80; // assigning  value to price
         System.out.println("I am constructor"); // it's print 3 times bcoz we have 3 constants in enum for detail info check notes
    }

    MobileBrand(int p){
         price=p;
    }

    public int getPrice(){
         return price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        System.out.println(MobileBrand.SAMSUNG.getPrice());

        System.out.println(MobileBrand.APPLE.getPrice());
        System.out.println(MobileBrand.APPLE.ordinal()); // this ordinal() method gives us sequence of constant element in enum, sequence start from zero, we have lots of methods in enum
         // Enum this is class and enum is extends this Enum class
        // we have ordinal so that menus we fetch values eg
        MobileBrand[] m = MobileBrand.values(); // here we store all values in m array
        for (MobileBrand values : m){ // here we are printing all elements
            System.out.println(values);
        }
    }
}
