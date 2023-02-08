package LeetCodeQuestions.EasyArrayQuestions;

public class TestRun {
    public static void main(String[] args) {
        System.out.println(noOfDigits(10));
    }

    static int noOfDigits(int no){
        int count=0;
        while (no>=0){
            if (no==0){
                count++;
            }
            no=no%10;
        }
        return count;
    }
}
