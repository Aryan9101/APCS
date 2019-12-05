package Arrays2d;

public class AntWalk {

    public static void main(String[] args) {
        byte[][] grid = new byte[9][9];
        int count = 0;
        int current_pos_x = 3;
        int current_pos_y = 3;
        while ((current_pos_x >= 0 && current_pos_x <= 8) && (current_pos_y >= 0 && current_pos_y <= 8)){
            count++;
            //System.out.println(current_pos_x + " " + current_pos_y);
            grid[current_pos_y][current_pos_x]++;
            printGrid(grid);
            int choice = (int)(Math.random()*4);
            switch (choice){
                case 0: current_pos_x++;
                break;
                case 1: current_pos_x--;
                break;
                case 2: current_pos_y++;
                break;
                case 3: current_pos_y--;
                break;
            }
        }
        System.out.print("Moves: " + count + "\nThe ant fell off to the ");
        if (current_pos_x > 8){
            System.out.print("EAST");
        } else if (current_pos_x < 0){
            System.out.print("WEST");
        } else if (current_pos_y < 0){
            System.out.print("NORTH");
        } else {
            System.out.print("SOUTH");
        }

    }

    public static void printGrid(byte[][] grid){
        for(int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
