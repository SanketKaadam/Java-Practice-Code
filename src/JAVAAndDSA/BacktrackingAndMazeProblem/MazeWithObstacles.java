package JAVAAndDSA.BacktrackingAndMazeProblem;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] bord = { {true,true,true},
                             {true,false,true},
                             {true,true,true}
                                                };
        pathRestriction("",bord,0,0);
    }

    static void  pathRestriction(String p, boolean[][] maze, int row, int col){
        if (row==maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[row][col]){ // if(maze[row][col]==false)
            return;
        }
        if (row< maze.length-1){ //last row
            pathRestriction(p+'D',maze,row+1,col); // here we're adding bcoz we're increasing row
        }
        if (col<maze[0].length-1){
            pathRestriction(p+'R',maze,row,col+1); //// here we're adding bcoz we're increasing col
        }
    }
}
