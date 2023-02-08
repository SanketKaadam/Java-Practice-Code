package JAVAAndDSA.PatternQuestions;

public class DownMirrorStarPattern {
    public static void main(String[] args) {
        rightDownMirrorStar(5);
    }
    static void rightDownMirrorStar(int n){
        for (int i=0; i<n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
