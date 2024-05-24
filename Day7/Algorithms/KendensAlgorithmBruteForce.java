package Day7.Algorithms;

import java.util.*;

public class KendensAlgorithmBruteForce {
  public static void main(String[] args) {
    
  
  Scanner sc = new Scanner(System.in);
 System.out.println("Enter the size of the arrau: ");
 int s= sc.nextInt();
 int a[]=new int[s];
 int sum=0;
 int max=0;
for(int i=0;i<s;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<s;i++){

for(int j=0;j<s;j++){
  sum+=a[j];
  if(sum>max){
    max=sum;
  }

}
}
  }
}
