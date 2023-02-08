package JAVAAndDSA.ArraysAndArrayList;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int start=0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
