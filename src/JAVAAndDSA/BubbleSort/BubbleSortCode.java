package JAVAAndDSA.BubbleSort;

import java.util.Arrays;

public class BubbleSortCode {
    // Bubble sort also knows as sinking sort and Exchange sort
    public static void main(String[] args) {
        int[]arr = {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        // run the step n-1 times
        for (int i=0; i< arr.length; i++){
            // for each step the largest element will come at the last respective index
            for (int j=1; j< arr.length-i; j++){ // -i bcoz right element came last index's
                // swap if element is smaller than the previous element
                if (arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
 }
