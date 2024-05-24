package Day7.Algorithms;
import java.util.*;
public class KendensAlgorithm {
  public static void main(String[] args) {
    
  
  Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int s=sc.nextInt();
int a[]= new int[s];
for(int i=0;i<s;i++){
  a[i]=sc.nextInt();
}
int sum=0;
int max=0;

for(int i=0;i<s;i++){
  sum+=a[i];
  if(sum>max){
max=sum;
  }
  if(sum<0){
    sum=0;
  }

}
System.out.println(max);
}
}


//Time complexity  O(n)