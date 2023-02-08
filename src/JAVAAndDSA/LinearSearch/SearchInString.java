package JAVAAndDSA.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Sanket Kadam";
        char target = 'd';
        int ans = search(name,target);
        System.out.println(ans);
    }

    static int search(String arr, char target){
        for (int index=0; index<arr.length(); index++){
            if (arr.charAt(index)==target){
                return index;
            }
        }
        return -1;
    }
}
