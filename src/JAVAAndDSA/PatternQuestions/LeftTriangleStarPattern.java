package JAVAAndDSA.PatternQuestions;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        leftTriangle(5);
    }

    static void leftTriangle(int n){
        for (int row=0; row<n; row++){
            int noOfSpace = 2*(n-row);
            for (int space=0; space<noOfSpace; space++){
                System.out.print(" ");
            }
            for (int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
