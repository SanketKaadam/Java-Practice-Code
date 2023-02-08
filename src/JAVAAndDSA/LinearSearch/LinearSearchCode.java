package JAVAAndDSA.LinearSearch;

public class LinearSearchCode {
    public static void main(String[] args) {
        int[] arr = {10,5,2,1,25,20,15,18,23,17,50};
        int target = 10;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0; i< arr.length; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
