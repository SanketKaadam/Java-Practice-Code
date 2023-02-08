package JAVAAndDSA.ArraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputAndOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array elements");
        int[] arr = new int[5];
        int[] arr2 = {1,2,3,4,5}; // here directly assigning values
        for (int i = 0; i< arr.length; i++){
            arr[i]= input.nextInt();
        }
        System.out.println("Now we printing Array");
        // 1st for method to print array
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); // new line

        // 2nd toString method to print array
        System.out.println(Arrays.toString(arr));

        // 3rd for-each method to print array
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
