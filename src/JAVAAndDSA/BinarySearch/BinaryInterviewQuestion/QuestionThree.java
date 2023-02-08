package JAVAAndDSA.BinarySearch.BinaryInterviewQuestion;

public class QuestionThree {
    public static void main(String[] args) {
        // Q3. Find the smallest letter greater than target not equal to target
        // Given character of array letter that is sorted in non-descending order and a character
        // target, return the smallest character in the array that is greater than target not equal
        // to target
        char[] letters = {'c','d','f','j'};
        char target = 'f';
        char ans = findNumber(letters,target);
        System.out.println(ans);
    }

    static char findNumber(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<letters[mid]){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
