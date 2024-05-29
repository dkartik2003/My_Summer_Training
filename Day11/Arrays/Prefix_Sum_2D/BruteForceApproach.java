package Day11.Arrays.Prefix_Sum_2D;
import java.util.*;
public class BruteForceApproach {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter rows");
    int r=scanner.nextInt();
    System.out.println("Enter cols");
    int c=scanner.nextInt();
    int a[][] = new int[r] [c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=scanner.nextInt();


      }
      System.out.println();
    }
    System.out.println("Enter the number of queries required: ");
    int q=scanner.nextInt();
    for(int i=0;i<q;i++){
      int sr=scanner.nextInt();
      int sc=scanner.nextInt();
      int er=scanner.nextInt();
      int ec=scanner.nextInt();
      int sum=0;
      for(int row=sr;row<=er;row++){
        for(int col=sc;col<=ec;col++){
          sum+=a[row][col];
        }

      }
      System.out.println("The sum of the: "+sum);


    }
  }
}
