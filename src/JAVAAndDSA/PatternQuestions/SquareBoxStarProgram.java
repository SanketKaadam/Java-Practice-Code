package JAVAAndDSA.PatternQuestions;

public class SquareBoxStarProgram {
    public static void main(String[] args) {
        squareBox(5);
    }

    static void squareBox(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
