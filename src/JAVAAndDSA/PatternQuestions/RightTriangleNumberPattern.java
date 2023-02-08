package JAVAAndDSA.PatternQuestions;

public class RightTriangleNumberPattern {
    public static void main(String[] args) {
        pyramidNumber(5);
    }
    static void pyramidNumber(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
