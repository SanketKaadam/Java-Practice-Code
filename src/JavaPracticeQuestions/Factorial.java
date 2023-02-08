package JavaPracticeQuestions;

public class Factorial {
    public static void main(String[] args) {
        factorial(10);
    }

    static void factorial(int n){
        int total=n;
        for (int i=n; i>1;i--){
            total=total*(i-1);
        }
        System.out.println(total);
    }
}
