package JAVAAndDSA.RecursionPatternBubbleSelectionAndMergeSortQuestions;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) { // if element only one return that element only
            return arr;
        }

        int mid = arr.length / 2; // to find mid-index
// Arrays.copyOfRange method copy elements from original array and create new object past this copied elements in that new object
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // 1st half
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); // 2nd half

        return merge(left, right); // merge both arrays
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length]; // new length after merge two arrays

        int i = 0; // pointer for left array
        int j = 0; // pointer for second array
        int k = 0; // pointer for new array mix

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
