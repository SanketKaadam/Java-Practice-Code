package JAVAAndDSA.ObjectOrientedPrograming.OOP2;

public class StaticBlock {

    static int a = 4;
    static int b;

    static { // static block
        System.out.println("I am in the static block ");
        b=a*5;
    }
    // static block will only run once, when the 1st object create ie when the class loaded for the 1st time

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock(); // here static block will run once because 1st object created
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        b=b+3; // change the value of 'b'
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock obj2 = new StaticBlock(); // here we create 2nd object but this time static block will not run
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
