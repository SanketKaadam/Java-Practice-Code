package JAVAAndDSA.RecursionArrayQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int target = 18;
        System.out.println(linearSearch(arr,target,0));
    }

    static int linearSearch(int[] arr, int target, int index){
        if (index== arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return linearSearch(arr,target,index+1);
    }
}
