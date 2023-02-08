package JAVAAndDSA.RecursionSubsetSubsequenceAndString;

public class SubSequences {
    public static void main(String[] args) {
        subSequences("","abc");
    }

    static void subSequences(String p, String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subSequences(p,up.substring(1));
        subSequences(p+ch, up.substring(1));
    }
}