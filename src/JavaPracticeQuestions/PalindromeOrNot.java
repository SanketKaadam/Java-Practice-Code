package JavaPracticeQuestions;

public class PalindromeOrNot {
    public static void main(String[] args) {
       boolean a= palindrome("abcdecba");

        if (a){
            System.out.println("Palindrome");
        }else {
            System.out.println("not Palindrome");
        }
    }

    static boolean palindrome(String n){
        int start=0;
        int end= n.length()-1;
        while(start<=end){
            if (n.charAt(start)==n.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
