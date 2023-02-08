package JAVAAndDSA.WhileLoop;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int no = input.nextInt();
        System.out.print("Which no occurrences u want to check: ");
        int check = input.nextInt();
        int reminder=0;
        int count=0;
        while(no>0){
            reminder=no%10;
            if (reminder==check){
                count++;
                no=no/10;
            }else {
               no=no/10;
            }
        }
        System.out.println(count);
    }
}
