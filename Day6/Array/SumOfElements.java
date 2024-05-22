package Day6.Array;
import java.util.*;
public class SumOfElements {
    


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int s = sc.nextInt();
      System.out.println();
      int a[] = new int[s];
      for (int i = 0; i < a.length; i++) {// input
        a[i] = sc.nextInt();
      }
     
      int sum = 0;
  
      for (int i = 0; i < a.length; i++) {// sum
        sum = sum + a[i];
  
      }
      System.out.println("The sum of all elements : " + sum);
    
  
      
  
    }
  }

