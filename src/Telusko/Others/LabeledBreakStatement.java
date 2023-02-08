package Telusko.Others;

public class LabeledBreakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (i==3)
                    break; // unlabeled break statement, here only inner loop break
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");


        sanket:  // flow came here
        for (int i = 1; i<=4; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (i==3)
                    break sanket; // labeled break statement, here outer loop also break
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
