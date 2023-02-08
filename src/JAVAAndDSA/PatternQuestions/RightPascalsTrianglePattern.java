package JAVAAndDSA.PatternQuestions;

public class RightPascalsTrianglePattern {
    public static void main(String[] args) {
        rightPascals(5);
    }

    static void rightPascals(int n){
        for (int row=0; row < 2*n; row++){
            int totalColsInRow;
             if(row>n){
                 totalColsInRow=2*n-row;
             }else {
                 totalColsInRow =row;
             }
             for (int col=0; col<totalColsInRow; col++){
                 System.out.print("* ");
             }
            System.out.println();
        }
    }
}
