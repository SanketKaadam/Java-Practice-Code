package JAVAAndDSA.Recursion;

public class PassingArgument {
    public static void main(String[] args) {
        print1(1);
    }
// this is not good way now we are printing 1 to 5 that's why we create 5 methods
// but suppose we want to print 1 to 500 then it not good make 500 methods/
// to solve this we use pure recursion
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    static void print5(int n){
        System.out.println(n);
    }
}
