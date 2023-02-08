package JAVAAndDSA.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45}; // ascending Order
        int[] arr = {45,22,18,16,15,4,3,2,0,-4,-12,-18}; // descending Order
        int target = -18;
        int ans = orderAgnoBinarySearch(arr,target);
        System.out.println(ans);
    }

    static int orderAgnoBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end]; // simple form of below if code
       /* if (arr[start]<arr[end]){
            isAsc = true;
        }else{
            isAsc= false;
        } */

        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (arr[mid]>target){
                    end= mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if (arr[mid]>target){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
