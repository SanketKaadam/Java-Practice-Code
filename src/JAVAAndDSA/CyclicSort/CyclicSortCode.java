package JAVAAndDSA.CyclicSort;

import java.util.Arrays;

public class CyclicSortCode {
    public static void main(String[] args) {
        int[] arr= {9,1,8,2,7,3,6,4,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int tmp= arr[first];
        arr[first]= arr[second];
        arr[second]=tmp;
    }
}
