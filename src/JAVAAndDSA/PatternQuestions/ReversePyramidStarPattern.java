package JAVAAndDSA.PatternQuestions;

public class ReversePyramidStarPattern {
    public static void main(String[] args) {
        reversePyramid(5);
    }

    static void reversePyramid(int n){
        for (int row=0; row<n; row++){
            int noOfSpace = n+row;
            for (int space=0; space<noOfSpace; space++){
                System.out.print(" ");
            }
            for (int col=0; col<n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
