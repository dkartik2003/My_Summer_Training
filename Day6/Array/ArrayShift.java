package Day6.Array;

import java.util.Scanner;

public class ArrayShift {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    System.out.println();
    int a[] = new int[s];
    for (int i = 0; i < a.length; i++) {
      a[i]= sc.nextInt();
    }

    
    int sum = 0;

    for (int i = 0; i < a.length; i++) {// sum
      sum = sum + a[i];

    }
    System.out.println("The sum of all elements : " + sum);
    int sum1=0;

    for(int i=0;i<a.length;i++){// positive sum
    if(a[i]%2==0){
    sum1=sum1+a[i];
    }
    }
    System.out.println("The sum of the positive no: "+sum1);

  }
}
