package Day5.Array;

import java.util.Scanner;

public class FindMax {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of the array");
  int size=sc.nextInt();
  int arr[]= new int[size];
  int pivot=Integer.MAX_VALUE;;
  for(int i =0;i<arr.length;i++){//Input and printing
      arr[i]=sc.nextInt();
    
      System.out.print(arr[i]+" ");
      
    }
    for(int i =0;i<=arr.length;i++){//
   
    if(pivot<arr[i]){
     pivot=arr[i];
      System.out.println("The lement is: "+i);
    }
    
      
      
    }



 } 
}
