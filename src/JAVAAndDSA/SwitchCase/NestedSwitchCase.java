package JAVAAndDSA.SwitchCase;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your empID: ");
        int empID = input.nextInt();
        switch (empID){
            case 1:
                System.out.println("Kunal kushawaha");
                break;
            case 2:
                System.out.println("sanket kadam");
                System.out.print("Enter department No: ");
                int depNo = input.nextInt();
                switch (depNo) {
                    case 10:
                        System.out.println("IT");
                        break;
                    case 20:
                        System.out.println("Business");
                        break;
                    case 30:
                        System.out.println("Management");
                        break;
                    default:
                        System.out.println("No department");
                }
                break;
            case 3:
                System.out.println("Raju singh");
                break;
            default:
                System.out.println("Enter invalid input");
        }
    }
}
