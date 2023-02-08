package JAVAAndDSA.PatternQuestions;

public class PyramidStarPattern {
    public static void main(String[] args) {
        pyramidStar(5);
    }

    static void pyramidStar(int n){
        for (int row=0; row<n; row++){
            int noOfSpace = n-row;
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
