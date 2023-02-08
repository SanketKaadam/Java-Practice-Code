package JavaPracticeQuestions;

public class PalindromeNumber {
    public static void main(String[] args) {
        palindrome(12321);
    }

    static void palindrome(int n){
        int r,sum=0,temp;
        temp=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        if (temp==sum){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
