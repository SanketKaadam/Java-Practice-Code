package JAVAAndDSA.RecursionSubsetSubsequenceAndString;

public class SkipStringNotTheRequiredString {
    public static void main(String[] args) {
// bacapplecdch here only skip app when it's not equal to apple
// eg bacapplecdch Output -> bacapplecdch bcoz this contains apple world
// bacapplcdch   Output -> baclcdch bcoz this not contains apple world, so skip app
        System.out.println(skip("bacapplcdch"));
    }

    static String skip(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skip(up.substring(3)); // 3 bcoz in app three characters present
        }
        return up.charAt(0) + skip(up.substring(1));
    }
}
