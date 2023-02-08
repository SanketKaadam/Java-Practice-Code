package JAVAAndDSA.ArraysAndArrayList;

import java.util.Arrays;

public class SwappingValuesInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int Index1, int Index2){
        int temp = arr[Index1];
        arr[Index1]=arr[Index2];
        arr[Index2]=temp;
    }
}
