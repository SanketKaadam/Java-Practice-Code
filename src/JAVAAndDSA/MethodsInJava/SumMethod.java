package JAVAAndDSA.MethodsInJava;

import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
       // sum();
        int ans = sum2();
        System.out.println("Addition is: "+ans);
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st No: ");
        int numberOne = input.nextInt();
        System.out.print("Enter 2nd No: ");
        int numberTwo = input.nextInt();
        int total=numberOne+numberTwo;
        System.out.println("Addition is: "+total);
    }

    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st No: ");
        int numberOne = input.nextInt();
        System.out.print("Enter 2nd No: ");
        int numberTwo = input.nextInt();
        return numberOne+numberTwo;
        //System.out.println("i am after return"); after return statement code is uncheckable
    }
}
