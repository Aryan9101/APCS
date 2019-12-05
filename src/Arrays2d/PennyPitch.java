package Arrays2d;

public class PennyPitch {
    public static void main(String[] args) {
        char[][] board = {{49,49,49,49,49},
                            {49,50,50,50,49},
                            {49,50,51,50,49},
                            {49,50,50,50,49},
                            {49,49,49,49,49}};
        int row, col, score = 0;
        for (int i = 1; i <= 3; i++){
            do {
                row = (int)(Math.random()*5);
                col = (int)(Math.random()*5);
            } while (board[row][col] == 'P');
            score += board[row][col];
            board[row][col] = 'P';
            printBoard(board);
        }
        System.out.println("Score: " + ((score+3)%147));
    }

    public static void printBoard(char[][] grid){
        for(int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
