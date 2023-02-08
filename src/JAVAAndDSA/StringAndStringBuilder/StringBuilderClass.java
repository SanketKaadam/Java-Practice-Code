package JAVAAndDSA.StringAndStringBuilder;

public class StringBuilderClass {
    public static void main(String[] args) {
        // In string builder only one object is made and changes made only that object and
        // reference also same it not change
        StringBuilder obj = new StringBuilder();
        for (int i=0; i<26; i++){
            char ch = (char)('a'+i);
            obj.append(ch);
        }
        System.out.println(obj);

        // string builder is mutable or it modifies
    }
}
