package JAVAAndDSA.RecursionLevelOneQuestions;

public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.println(product(1242));
    }

    static int product(int n){
        if (n%10==n){ // at the end n value become 1 so 1%10==1 will true
            return n;
        }
        return (n%10)*product(n/10);
    }
}
