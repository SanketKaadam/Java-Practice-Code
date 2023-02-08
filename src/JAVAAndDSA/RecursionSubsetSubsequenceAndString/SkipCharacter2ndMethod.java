package JAVAAndDSA.RecursionSubsetSubsequenceAndString;

public class SkipCharacter2ndMethod {
    public static void main(String[] args) {
        System.out.println(skipChar("baccad"));
    }

    static String skipChar(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if (ch=='a'){
            return skipChar(up.substring(1));
        }else {
            return ch + skipChar(up.substring(1)); // it adds character and then return
        }
    }
}
