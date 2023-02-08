package JAVAAndDSA.Recursion;

public class PassingArgumentRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n==5){ // base condition, if we don't put base condition then program calling itself continuously it did not stop that's why base condition is imp
            System.out.println("5");
            return;
        }
        System.out.println(n);
        print(n+1); // calling itself with different arguments
    }
}
