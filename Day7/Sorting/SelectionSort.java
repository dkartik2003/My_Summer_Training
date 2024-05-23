package Day7.Sorting;
import java.util.*;
public class SelectionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int s=sc.nextInt();
    int a[]=new int[s];
    for(int i=0;i<s;i++){//input
      a[i]=sc.nextInt();
    }
    int temp=0;
    int req_index=0;
    for(int i=0;i<s;i++){//Logic
     req_index=i;
      for(int j=i;j<s;j++){
          if(a[req_index]>=a[j]){
            req_index=j;

          }
          //swap
          temp=a[i];
          a[i]=a[req_index];
          a[req_index]=temp;
      }
    }
    for(int i=0;i<s;i++){
      System.out.print(a[i]+"   ");
    }
  }
}
