package Day7;

import java.util.*;

public class SortEvenSortOdd {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int s=sc.nextInt();
    int a[]=new int[s];
    for(int i=0;i<s;i++){//Input
      a[i]=sc.nextInt();
    }
    int s2=(s/2)+1;
    int even[]=new int[s];
    int odd[]=new int[s];
    for(int i=0;i<s;i++){
      if(i%2==0){
          even[i]=a[i];

      }else{
        odd[i]=a[i];

      }
    }

    //bubblesort for even no.
    int temp=0;
    int req_index=0;
   for(int i=0;i<s;i++){
    
    for(int j=0;j<s-i-1;j++){
      if(a[j]>a[j+1]){
          a[j]=temp;
          temp=a[j+1];
          a[j+i]=a[i]
      }

      }
   }
   for(int i=0;i<s;i++){
    System.out.println(even[i]);

   }

    //forodd no.






    // int finalarr[]=new int[s];
    // for(int i=0;i<s;i++){
    //   finalarr[i]=even[i];

    // }
    // for(int i=0;i<s2;i++){
    //   System.out.println("The elements are: "+finalarr[i]);
    // }
  }
}
