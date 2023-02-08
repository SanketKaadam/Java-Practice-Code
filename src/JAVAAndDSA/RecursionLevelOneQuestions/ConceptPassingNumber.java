package JAVAAndDSA.RecursionLevelOneQuestions;

public class ConceptPassingNumber {
    public static void main(String[] args) {
        pass(5);
    }

    static void pass(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        // pass(n--); here first pass value 5 that's why it call again and again pass(5)
        pass(--n); // first minus and then pass
    }
}
