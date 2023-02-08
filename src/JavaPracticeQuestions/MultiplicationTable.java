package JavaPracticeQuestions;

// Take a number as input and print the multiplication table for it.
public class MultiplicationTable {
    public static void main(String[] args) {
        table(2);
    }

    public static void table(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
