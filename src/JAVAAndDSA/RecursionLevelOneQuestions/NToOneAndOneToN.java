package JAVAAndDSA.RecursionLevelOneQuestions;

public class NToOneAndOneToN {
    public static void main(String[] args) {
        range(5);
    }

    static void range(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        range(n-1);
        System.out.println(n);
    }
}
