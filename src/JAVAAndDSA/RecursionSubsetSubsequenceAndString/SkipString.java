package JAVAAndDSA.RecursionSubsetSubsequenceAndString;

public class SkipString {
    public static void main(String[] args){
        System.out.println(skipString("bdapplefg"));
    }

    static String skipString(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipString(up.substring(5)); // 5 bcoz in apple there is 5 characters
        }
        return up.charAt(0) + skipString(up.substring(1)); // for up.charAt(0) watch recursion tree from notes
    }
}
