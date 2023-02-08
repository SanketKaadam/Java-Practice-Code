package JAVAAndDSA.SelectionSort;

import java.util.Arrays;

public class SelectionSortCode {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int maxElement  =  start;
        for (int i=0; i<=end; i++){
            if (arr[i]>arr[maxElement]){
                maxElement=i;
            }
        }
        return maxElement;
    }
}
