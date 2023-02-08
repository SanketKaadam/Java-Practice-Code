package JAVAAndDSA.ObjectOrientedPrograming.OOP2;

public class StaticMethods {
    public static void main(String[] args) {

        greeting("sanket"); // main and greeting both methods are static so don't need to create object it work directly

        //greeting2(); error bcoz it non-static
        StaticMethods obj =new StaticMethods();
        obj.greeting2("kunal"); // now it work by using object
    }

    static void greeting(String naam){
        System.out.println("Hello, How are you? "+naam);
    }

    void greeting2(String meraNaam){
        System.out.println("Hello, How are you? "+meraNaam);
    }
}
