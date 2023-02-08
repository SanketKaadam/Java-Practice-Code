package JavaPracticeQuestions;

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class TakingInputAsPerUser {
    public static void main(String[] args) {

        String choice = "";

        int sum = 0;
        int product = 1;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while(!choice.equals("q")){
            System.out.println("Enter a number or q to quit");
            choice = input.next();

            if(!choice.equals("q")){
                int number = Integer.parseInt(choice); //The method generally used to convert String to Integer in Java is parseInt(). This method belongs to Integer class in java. lang package. It takes a valid string as a parameter and parses it into primitive data type int
                sum = sum+number;
                product = product*number;
                count++;
            }
        }

        System.out.println("Product is: "+product+"\nAverage is: "+((float)sum/count));

    }
}
