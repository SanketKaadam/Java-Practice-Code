package JAVAAndDSA.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    static int fibonacci(int n){ // base condition fibonacci of 1 is 1 and fibonacci of 0 is 0
        if (n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
