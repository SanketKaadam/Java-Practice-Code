package JAVAAndDSA.RecursionQuickSort;

import java.util.Arrays;

public class QuickSortCode {
    public static void main(String[] args) {
        int[] arr={8,5,6,4,7,1,2,3,9};
        quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); // internally it also use quick sort
    }

    static void quick(int[] arr, int low, int high){
        if (low >= high) {
            return;
        }
        int start=low;
        int end=high;
        int m=start+(end-start)/2;
        int pivot = arr[m];
        while (start<=end){
            // also a reason why if its already sorted it will not swap
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if (start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        // now my pivot is at correct index, please sort two halves now
        quick(arr,low,end);
        quick(arr,start,high);
    }
}
