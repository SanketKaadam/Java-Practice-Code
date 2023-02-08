package JAVAAndDSA.RecursionLevelOneQuestions;

public class FactorialOfNo {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n){
        if (n<=1){ // factorial of zero and one is one
            return 1;
        }
        return n*factorial(n-1);
    }
}
