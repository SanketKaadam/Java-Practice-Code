package JAVAAndDSA.RecursionSubsetSubsequenceAndString;

public class SkipCharacter {
    public static void main(String[] args) {
        skipChar("","baccad");
    }

    static void skipChar(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0); // here we get zero index char
        if (ch=='a'){
            skipChar(p,up.substring(1)); // up.substring(1) create new object and remove 1st element
        }else {
            skipChar(p+ch,up.substring(1)); // if chr is not equal to a then it add to process p
        }
    }
}
