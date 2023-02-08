package JAVAAndDSA.RecursionArrayQuestions;

import java.util.ArrayList;

public class ReturnArrayListWithoutPassingArgument {
    public static void main(String[] args) {
        int[] arr = {1,3,10,5,15,25,13,10,50,10};
        int target =10;
        System.out.println(findAllIndex(arr,target,0));
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index== arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
