package JAVAAndDSA.RecursionArrayQuestions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        int target=7;
        System.out.println(rotatedSearch(arr,target,0,arr.length-1));
    }

    static int rotatedSearch(int[] arr, int target, int start, int end){
        if (start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]<=arr[start]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return rotatedSearch(arr, target, start, mid - 1);
            } else {
                return rotatedSearch(arr, target, mid + 1, end);
            }
        }
        if (target>=arr[mid] && target<=arr[end]){
            return rotatedSearch(arr,target,mid+1,end);
        }
        return rotatedSearch(arr,target,start,mid-1);
    }
}
