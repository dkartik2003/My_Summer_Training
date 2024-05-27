package Day9.Arrays2D;
import java.util.*;
public class SortedRowAndColFindElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns: ");
    int s=sc.nextInt();
    int a[][]=new int[s][s];
    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<s;i++){
      for(int j=0;i<s;j++){
           a[i][j]=sc.nextInt();

      }
      
    }
  }
}
