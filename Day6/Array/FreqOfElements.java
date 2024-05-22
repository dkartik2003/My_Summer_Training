package Day6.Array;
import java.util.*;
public class FreqOfElements {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    System.out.println();

    int arr[] = new int[size];
    int pivot = Integer.MIN_VALUE;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {// Input and printing
      arr[i] = sc.nextInt();

      System.out.println(arr[i] + " ");

    }
    for (int i = 0; i <=arr.length; i++) {// Logic

      if (arr[i] > pivot) {
        pivot = arr[i];
      }
      
    }
    for(int i=0;i<=arr.length;i++){
        if(arr[i]==pivot){
          count++;
        }
    }
    System.out.println("The max elemnt is :" + pivot);
System.out.println("The frequency is:"+count);
  }
}
