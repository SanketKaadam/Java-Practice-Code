package JAVAAndDSA.ArraysAndArrayList;

public class MaximumValueOfArray {
    public static void main(String[] args) {
        int[] arr = {-500,200,50,300,400,499};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxElement = arr[0];
        for (int i=0; i< arr.length; i++){
            if(maxElement<arr[i]){
                maxElement=arr[i];
            }
        }
        return maxElement;
    }
}
