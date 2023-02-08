package JAVAAndDSA.PatternQuestions;

public class RightDownMirrorStarPattern {
    public static void main(String[] args) {
        rightDownMirror(5);
    }

    static void rightDownMirror(int n){
        for (int row=0; row<n; row++){
            int noOfSpace = 2*(n+row);
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
