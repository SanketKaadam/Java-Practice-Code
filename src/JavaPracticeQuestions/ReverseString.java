package JavaPracticeQuestions;

public class ReverseString {
    public static void main(String[] args) {
        revers("sanket");
    }

    static void revers(String name){
        for (int i=name.length()-1; i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
