package JAVAAndDSA.LinearSearch;

public class SearchMaxValueIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10,2,5,4},
                {20,30,40,50},
                {5,12,150,20,10}
        };
        int ans = max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr){
        int maxValue = arr[0][0];
        for (int row=0; row< arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
                if (arr[row][col]>maxValue){
                    maxValue = arr[row][col];
                }
            }
        }
        return maxValue;
    }
}
