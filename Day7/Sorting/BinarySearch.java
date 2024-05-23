package Day7.Sorting;

import java.util.*;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int s=sc.nextInt();
    int a[]=new int[s];
    for(int i=0;i<s;i++){//input
      a[i]=sc.nextInt();
    }
    System.out.println("Enter the no you want to find: ");
    int target=sc.nextInt();
    int left=0;
    int right=s-1;
    int mid=0;
   
    while(left<=right){
mid=(left+(right-left+1)/2);//mid=(r+l)/2
if(a[mid]>target){
right=mid-1;



    }else if(a[mid]<target){
      left=mid+1;

    }else {
      System.out.println(mid +"is at"+a[mid]);
      break;
    }


  }
}
}

// The binary search is always applicable on a sorted array
