package JAVAAndDSA.RecursionArrayQuestions;

import java.util.ArrayList;

public class LinearSearchMultipleOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,3,10,5,15,25,13,10,50,10};
        int target =10;
        findAllIndex(arr,target,0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index== arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index); // insist of returning index we're adding in list
        }
         findAllIndex(arr,target,index+1);
    }
}
