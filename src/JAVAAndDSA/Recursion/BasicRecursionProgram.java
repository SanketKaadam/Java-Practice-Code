package JAVAAndDSA.Recursion;

public class BasicRecursionProgram {
    public static void main(String[] args) {
        message1(); // in main method we only called one method
    }

    static void message1(){
        System.out.println("Hellow world 1");
        message2(); // here calling another method
    }

    static void message2(){
        System.out.println("Hellow world 2");
        message3();// here we again calling another method and we keep doing this
    }

    static void message3(){
        System.out.println("Hellow world 3");
        message4();
    }

    static void message4(){
        System.out.println("Hellow world 4");
        message5();
    }
    static void message5(){ // in this method we not calling any method
        System.out.println("Hellow world 5"); // from here program flow go above till main method
    }
}
