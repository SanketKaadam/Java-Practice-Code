package Telusko.EnumPackage;

interface MobileCompany{ // before enum we use interface to store range of constants
    static String APPLE = "Apple";
    static String SAMSUNG = "Samsung";
    static String HTC = "HTC";
}

public class EnumInJava {
    enum Mobile{ // Here I created enum in class, note we can't create enum in method
        APPLE,SAMSUNG,HTC;
    }
    public static void main(String[] args) {
       // if (MobileCompany.APPLE==1){ } // getting error bcoz we don't know what datatype is used in interface to solve this problem we use enum
        System.out.println(Mobile.APPLE); // It's giving output
    }
}
