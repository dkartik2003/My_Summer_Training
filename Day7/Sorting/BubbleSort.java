package Day7.Sorting;

import java.util.*;

public class BubbleSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){//input
      a[i]=sc.nextInt();
    }
    int temp=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n-1-i-1;j++ ){
        if(a[j]<a[j+1]){
            temp=a[j];        //swap
            a[j]=a[j+1];
            a[j+1]=temp;
            }

      }

    }
    for(int i=0;i<n;i++){
System.out.println(a[i]+"   ");    
}
  }
}

// Time complexity O(n*n)
