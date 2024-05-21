package Day5.Array;
import java.util.*;
public class ArraySwapWithinArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int n=sc.nextInt();
    int arr[]= new int[n];
    int temp=0;
    int a,b;
    for(int i =0;i<arr.length;i++){//Input and printing
      arr[i]=i;
    
      System.out.print(arr[i]+" ");
      
    }


    // arr[0]=a;
    // arr[arr.length]=b;
    for(int i=0;i<n/2;i++)//Logic
        {
        a=arr[i];
        b=arr[arr.length-i-1];
        temp=a;
        a=b;
        b=temp;
        arr[i]=a;
        arr[n-i-1]=b;

        }   

        for(int i =0;i<arr.length;i++){//Reverse array is printed        
          System.out.println(arr[i]);
          
        }




//for(int i =arr.length-1;i>=0;i--){

// c[i]=arr[i];


// System.out.println();
// System.out.println(c[i]);
     // System.out.println(arr[i]);
      // System.out.println();

  }
}
//}
