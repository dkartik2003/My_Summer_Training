package Day9.Arrays2D;

import java.util.*;

public class TransposeArray2ndApproach {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size r and c same: ");
    int r = sc.nextInt();

    int arr[][] = new int[r][r];
    for (int i = 0; i < r; i++) {// input
      for (int j = 0; j < r; j++) {
        arr[i][j] = sc.nextInt();
      }

    }
    for(int row=0;row<r;row++){
      for(int col=0;col<r;col++){
        if(row-col>0){
        int temp=arr[row][col];
        arr[row][col]=arr[col][row];
        arr[col][row]=temp;
      }
    }
  }
  for(int row=0;row<r;row++){
    for(int col=0;col<r;col++){
      System.out.print(arr[row][col]+"\t");

  }
  System.out.println();
  }
  }
}
