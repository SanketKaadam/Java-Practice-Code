package JAVAAndDSA.ArraysAndArrayList;

import java.util.Arrays;

public class ArrayPassingFunction {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        change(arr); // here we called method and also pass array as parameter
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[3]=100; // here we change value at index no 3
    }
}
