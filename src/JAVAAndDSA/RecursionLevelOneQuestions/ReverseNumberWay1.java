package JAVAAndDSA.RecursionLevelOneQuestions;

public class ReverseNumberWay1 {
    public static void main(String[] args) {
       reverse(12325478);
    }

    static void reverse(int n){
        if (n==0){
            return;
        }
        System.out.print(n%10);
        reverse(n/10);
    }
}
