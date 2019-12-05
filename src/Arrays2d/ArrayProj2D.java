package Arrays2d;

import java.util.Random;
public class ArrayProj2D 
{

  private static int grid[][];
 

// prints the grid
  public static void gridPrint() 
  {
    for (int i = 0; i < grid.length; i++){
      for (int j = 0; j < grid[i].length; j++){
        System.out.print(grid[i][j] + "\t");
      }
      System.out.println();
    }
  }

 
// fills grid with random digits
  public static void gridFill() 
  {
    for (int i = 0; i < grid.length; i++){
      for (int j = 0; j < grid[i].length; j++){
        grid[i][j] = (int)(Math.random() * 10);
      }
    }
  }

 
 //returns the sum of all the int values in grid
  public static int gridSum()
 {
   int sum = 0;
   for (int i = 0; i < grid.length; i++){
     for (int j = 0; j < grid[i].length; j++){
       sum += grid[i][j];
     }
   }
   return sum;
  }

 
// returns the number of even int values in grid
  public static int gridCountEvens()
  {
    int count = 0;
    for (int i = 0; i < grid.length; i++){
      for (int j = 0; j < grid[i].length; j++){
        if(grid[i][j] % 2 == 0){
          count++;
        }
      }
    }
    return count;
  }

// returns true if grid is a square matrix, false otherwise
  public static boolean gridIsSquare()
  {
    return grid.length == grid[0].length;
  }


// if grid is a square Matrix then return the sum of all the elements
// on the two diagonals of grid
// (note: if n is odd, do not add the middle element twice) otherwise return -1
  public static int gridSumDiagonals() {
    if (gridIsSquare()) {
      int sum = 0;
      for (int i = 0; i < grid.length; i++){
        sum += grid[i][i];
        sum += grid[i][grid.length-1-i];
      }
      if(grid.length%2==1){sum-=grid[grid.length/2][grid[0].length/2];}
      return sum;
    } else {
      return -1;
    }
  }


//returns the index of the row that has the largest average value
  public static int gridRowWithMaxAvg()
  {
    int max = Integer.MIN_VALUE;
    int index = 0;
    for (int i = 0; i<grid.length; i++){
      int sum = 0;
      for (int j = 0; j < grid[i].length; j++){
        sum += grid[i][j];
      }
      if (sum/grid[i].length > max) {
        max = sum / (grid[i].length);
        index = i;
      }
    }
    return index;
  }


// returns true if grid has two adjacent (horiz or vert) elements are equal..
//   false otherwise
  public static boolean gridHasAdjacentDouble()
  {
    for (int i = 0; i<grid.length-1; i++){
      for (int j = 0; j < grid[i].length; j++){
        if (grid[i][j] == grid[i+1][j]){
          return true;
        }
      }
    }
    for (int i = 0; i<grid.length; i++){
      for (int j = 0; j < grid[i].length-1; j++){
        if (grid[i][j] == grid[i][j+1]){
          return true;
        }
      }
    }
    return false;
  }


// ~~~~~~ CHALLENGE ~~~~~~
//transpose grid (similar to arrayReverse)
//  (i.e. reflect over its main diagonal 
//  (which runs top-left to bottom-right)
//   you MUST call the swap helper method 
//   but you man NOT create a second array for storage
//  example:
//     1 2 3                 1 4 7
//     4 5 6   would become  2 5 8
//     7 8 9                 3 6 9
//  public static void gridTranspose() {
//      if (gridIsSquare()) {
//          for (int i = 1; i < grid.length; i++) {
//              for (int j = 0; j < i; j++) {
//                  gridSwap(i, j, j, i);
//              }
//          }
//      }
//  }


//~~~~~~ CHALLENGE ~~~~~~ 
// swap the values at grid[r1][c1] and grid[r2][c2]
// you may use use an int temp as a temporary variable
  public static void gridSwap(int r1, int c1, int r2, int c2) 
  {
    int temp = grid[r2][c2];
    grid[r2][c2] = grid[r1][c1];
    grid[r1][c2] = temp;
  }

  public static void main(String args[]) 
  {
    System.out.println("2D Array Methods\n");
	Random rand = new Random();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    for (int trial = 1; trial <= 8; trial++) {
      int numRows = rand.nextInt(2) + 3;
      int numCols = rand.nextInt(2) + 3;
      grid = new int[numRows][numCols];
      gridFill();
      gridPrint();
      System.out.println("~~~~~gridSum()               : " + gridSum());
      System.out.println("~~~~~gridCountEvens()        : " + gridCountEvens());
      System.out.println("~~~~~gridSumDiagonals()      : " + gridSumDiagonals());
      System.out.println("~~~~~gridRowWithMaxAvg()     : "+ gridRowWithMaxAvg());
      System.out.println("~~~~~gridHasAdjacentDouble() : "+ gridHasAdjacentDouble());
      // uncomment next 2 lines for bonus
      //gridTranspose();
      //gridPrint();
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

 }

} 

