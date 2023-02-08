package JavaPracticeQuestions;

// You will be expected to write a programme to determine whether a given number is prime or composite. A prime number is greater than 1 and can only be divided by 1 or itself.
public class PrimeNumber {
    public static void main(String[] args) {
        int n=20;
        for (int i=1; i<=n; i++){
            System.out.println(i+" "+isPrime(i));
        }
    }

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }

        int c=2;
        while(c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
