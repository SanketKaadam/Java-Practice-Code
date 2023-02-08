package JAVAAndDSA.ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1st method by using for loop to take input
        int[][] arr = new int[3][3];
        for (int row=0; row< arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                arr[row][col]= input.nextInt();
            }
        }

        // 2nd method by assigning value to take input
        int[][] arr2 = {
                          {10,20,30},
                          {40,50,60},
                          {70,80,90}
                                      };

        // 1st method by using for loop to print 2D array
        for (int row=0; row< arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
        }
        System.out.println(); // new line

        // 2nd method by using for each loop to print
        for (int[] num:arr){
            System.out.print(Arrays.toString(num));
        }
        System.out.println(); // new line

        // 3rd method by using toString method to print output
        for (int row=0; row< arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
