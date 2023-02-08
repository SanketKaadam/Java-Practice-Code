package JAVAAndDSA.StringAndStringBuilder;

public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for (int i=0; i<26; i++){
            char ch = (char)('a'+i);
            series= series+ch;
        }
        System.out.println(series);
        // one of the datatype is string output will be string
        // the problem here is at every iteration new object is created bcoz we can't
        // modify string and it take extra space and old object not have reference variable
        // to solve this problem we use StringBuilder
    }
}
