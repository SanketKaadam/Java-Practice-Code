package JAVAAndDSA.LinearSearch;

import java.util.Arrays;

public class TwoDArrayLinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                         {10,2,5,4},
                         {20,30,40,50},
                         {55,12,15,20,10}
                                           };
        int target =40;
        int[] ans = search2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2D(int[][] arr, int target){
        for (int row=0; row< arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
