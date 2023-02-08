package JAVAAndDSA.WhileLoop;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int number = input.nextInt();
        int reminder=0;
        while (number>0){
            reminder=number%10;
            System.out.print(reminder);
            number=number/10;
        }
    }
}
