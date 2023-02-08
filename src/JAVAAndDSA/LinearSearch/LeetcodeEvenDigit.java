package JAVAAndDSA.LinearSearch;

public class LeetcodeEvenDigit { // incomplete code need to solve this
    public static void main(String[] args) {
        int[] arr = {18, 124, 9, 1764, 98, 1};
        int ans = evenDigits(arr);
        System.out.println(ans);
    }

    static int evenDigits(int[] arr){
        int count=0;
        int finalCount=0;
        for (int i=0 ; i< arr.length; i++){
            while (arr[i]>0){
                count++;
                arr[i]=arr[i]/10;
                if (count%10==0){
                    finalCount++;
                }
            }
        }
        return finalCount;
    }
}
