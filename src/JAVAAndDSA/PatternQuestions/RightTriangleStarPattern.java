package JAVAAndDSA.PatternQuestions;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        pyramid(5);
    }

    static void pyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
