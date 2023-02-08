package Telusko.EnumPackage;

enum MobileDemo{
    APPLE,SAMSUNG,HTC;

    int price; // we also create variables and methods in enum same like class

    public int getPrice(){
        return price;
    }
}

public class EnumSwitchAndWorking {
    public static void main(String[] args) {
        MobileDemo m = MobileDemo.APPLE; // here is store the APPLE value in m variable
        switch (m){
            case APPLE -> System.out.println("Apple is best");
            case SAMSUNG -> System.out.println("Samsung is Good");
            case HTC -> System.out.println("HTC is avg");
          //  case SANKET -> System.out.println("I am the best"); we only name which  is present in enum
            }

        System.out.println(MobileDemo.APPLE.getPrice());

        // internal working of enum, at backed when we compile above code compiler create enum class
          class MobileDemo{
            static final MobileDemo APPLE = new MobileDemo();
            static final MobileDemo SAMSUNG = new MobileDemo();
            static final MobileDemo HTC = new MobileDemo();
        }
    }
}
