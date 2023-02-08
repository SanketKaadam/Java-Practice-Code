package JAVAAndDSA.WhileLoop;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alphabet = input.next().trim().charAt(0);
        if (alphabet>='a' && alphabet<='z'){
            System.out.println("lower Case");
        }else{
            System.out.println("Upper Case");
        }
    }
}
