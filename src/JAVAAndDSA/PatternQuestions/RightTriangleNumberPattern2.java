package JAVAAndDSA.PatternQuestions;

public class RightTriangleNumberPattern2 {
    public static void main(String[] args) {
        pyramidNumber2(5);
    }
    static void pyramidNumber2(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
