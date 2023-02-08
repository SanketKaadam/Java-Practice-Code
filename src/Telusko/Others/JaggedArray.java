package Telusko.Others;

public class JaggedArray {
    public static void main(String[] args) {
        // jagged means array size is not compulsory to be fixed
        // we can have 3 rows with different number of columns
        // this type of properties called as jagged array

        int[][] arr = new int[3][]; // row is mandatory to mention but not column is mandatory to mention

        arr[0]= new int[4]; // here for each row column size mention different
        arr[1]= new int[2];  // jagged array
        arr[2]= new int[3];

    }
}
