package JAVAAndDSA.ArraysAndArrayList;

public class MaxValueOfPerticularRange {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(max(arr,2,5));
    }

    static int max(int[] arr, int index1, int index2){
        int maxValue = arr[0];
        for (int i=index1; i<=index2; i++){
            if (arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
}
