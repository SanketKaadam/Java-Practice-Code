package JAVAAndDSA.ObjectOrientedPrograming.OOP3;

//public class Box{ } in one file two public class not allowed
class Box{
    public static void greeting(){
        System.out.println("i am static Box method");
    }
}

class BoxWeight extends Box{

    public static void greeting(){ // overriding method
        System.out.println("i am static BoxWeight method");
    }
}

public class OverridingStaticMethods extends BoxWeight { // inherited BoxWeight
    public static void main(String[] args) {
        BoxWeight bw = new BoxWeight();
        bw.greeting();  // here static method is inherited


        Box b = new BoxWeight();
        b.greeting(); // here i am try to access BoxWeight child method but, it's not working

    }
}
