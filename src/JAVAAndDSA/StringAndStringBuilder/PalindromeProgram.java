package JAVAAndDSA.StringAndStringBuilder;

public class PalindromeProgram {
    public static void main(String[] args) {
        String str = "abcdcba";
        boolean ans = palindrome(str);
        if (ans){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }

    static boolean palindrome(String str){
      int start = 0;
      int end = str.length()-1;
      while(start<end){
          if (str.charAt(start)==str.charAt(end)){
              start++;
              end--;
          }else{
              return false;
          }
      }
        return true;
    }
}
