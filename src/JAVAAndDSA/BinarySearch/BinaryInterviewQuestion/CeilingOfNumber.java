package JAVAAndDSA.BinarySearch.BinaryInterviewQuestion;

public class CeilingOfNumber {
    public static void main(String[] args) {
        // Ceiling of no means find the smallest no that greater than or equal to target number
        int[] arr = {2,3,5,9,14,16,18};
        int target = 30;
        int ans = ceilingOfNumber(arr,target);
        System.out.println(ans);
    }

    static int ceilingOfNumber(int[]arr, int target){
        if (target> arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
