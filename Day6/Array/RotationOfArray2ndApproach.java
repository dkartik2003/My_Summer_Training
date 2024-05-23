package Day6.Array;

import java.util.Scanner;

public class RotationOfArray2ndApproach {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int s = sc.nextInt();
    System.out.println();
    int a[] = new int[s];
    for (int i = 0; i < a.length; i++) {// input
      a[i] = sc.nextInt();
    }
    System.out.println("Enter the point k : ");
    int k = sc.nextInt();
    int aux[]=new int[s];
   for(int i=k;i>=0;i--){
      aux[k]=a[i];
    

   }
   for(int i=0;i<s;i++){
    System.out.println(aux[i]);

   }
    
    

  }
}
