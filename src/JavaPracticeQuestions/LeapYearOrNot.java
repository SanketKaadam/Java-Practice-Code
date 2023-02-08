package JavaPracticeQuestions;

// Input a year and find whether it is a leap year or not.
// leap year divisible by 4 and not divisible by 100
public class LeapYearOrNot {
    public static void main(String[] args) {
        leap(1977);
    }

    public static void leap(int n){
        if (n%4==0 && n%100!=0){
            System.out.println("leap year");
        }else {
            System.out.println("not leap year");
        }
    }
}
