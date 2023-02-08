package JAVAAndDSA.BacktrackingAndMazeProblem;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(maze(3,3));
    }

    static int maze(int row, int col){
        if (row==1 || col==1){ // if we go till last row or col there is only one path that's why here we're returning one
            return 1;
        }
        int left = maze(row-1,col); // on left side we decrease row by one
        int right = maze(row,col-1); // // on right side we decrease row by one
        return left+right;  // watch binary tree from notes
    }
}
