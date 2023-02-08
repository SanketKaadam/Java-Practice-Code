package JAVAAndDSA.PatternQuestions;

public class SandGlassStarPattern {
    public static void main(String[] args) {
        sandGlass(5);
    }
    static void sandGlass(int n){
        for (int row=0; row<2*n; row++){
            int totalColsInRow;
            if (row>n){
                totalColsInRow=2*n-row;
            }else {
                totalColsInRow=row;
            }
            int noOfSpace =n+totalColsInRow;
            for (int space=0; space<noOfSpace; space++){
                System.out.print(" ");
            }
            for (int col=0; col<=n-totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
