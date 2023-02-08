package JAVAAndDSA.BacktrackingAndMazeProblem;

public class MazeIncludingDiagonalPath {
    public static void main(String[] args) {
        maze("",3,3);
    }

    static void maze(String p, int row, int col){
        if (row==1 && col==1){
            System.out.println(p);
            return;
        }
        if (row>1){
            maze(p+'D',row-1,col);
        }
        if (col>1){
            maze(p+'R',row,col-1);
        }
        if (row>1 && col>1){
            maze(p+'I',row-1,col-1); // I means diagonal
        }
    }
}
