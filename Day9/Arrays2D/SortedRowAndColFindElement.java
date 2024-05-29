package Day9.Arrays2D;
import java.util.*;
public class SortedRowAndColFindElement {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n=matrix.length;
      int m=matrix[0].length;
      int row=n-1;
      int col=0;
      while(row>=0&&col<m){
          if(target>matrix[row][col]){
              col++;
          }
          else if(target<matrix[row][col]){
              row--;
          }
          else{
              return true;
          }
      }
      return false;
      
    }
  }

