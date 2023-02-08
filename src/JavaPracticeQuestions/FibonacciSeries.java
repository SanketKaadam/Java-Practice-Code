package JavaPracticeQuestions;

// Starting with 0 and 1, the Fibonacci series is a series of elements in which the previous two elements are added to get the next element.
public class FibonacciSeries {
    public static void main(String[] args){
        fibo(10);
    }

    public static void fibo(int n){
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i=2; i<n; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
