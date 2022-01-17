package medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    //Write a function that takes in an n x m two-dimensional array and returns
    //a one- dimensional array of all the array's elements in spiral order.
    public static List<Integer> spiralTraverse(int[][] array) {
        if(array.length == 0) return new ArrayList<Integer>();
        ArrayList<Integer> results = new ArrayList<Integer>();

        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){

            for(int i = startCol; i <= endCol; i++){
                results.add(array[startRow][i]);
            }

            for(int i = startRow + 1; i <= endRow; i++){
                results.add(array[i][endCol]);
            }

            for(int i = endCol - 1; i >= startCol; i--){
                if(startRow == endRow) break;
                results.add(array[endRow][i]);
            }

            for(int i = endRow - 1; i > startRow; i--){
                if(startCol == endCol) break;
                results.add(array[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return results;
    }
}
