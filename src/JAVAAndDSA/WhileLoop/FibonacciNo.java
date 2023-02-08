package JAVAAndDSA.WhileLoop;

import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many no's you want to print: ");
        int count = input.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i=2; i<count;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
