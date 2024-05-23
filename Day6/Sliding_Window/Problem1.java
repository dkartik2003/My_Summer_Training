package Day6.Sliding_Window;


  import java.util.*;

public class Problem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int s = sc.nextInt();
    System.out.println();
    int a[] = new int[s];
    System.out.println("Enter the k: ");
    int k =sc.nextInt();
    for (int i = 0; i < s; i++) {// Input
      a[i] = sc.nextInt();


    }
int sliding_sum=0;
for(int i=0;i<k;i++){
sliding_sum+=a[i];
}
System.out.println("("+0+","+(k-1)+"-->"+sliding_sum);

for(int i=1;i<s-k+1;i++){
  sliding_sum=(-a[i-1]+sliding_sum-a[k+i-1]);

System.out.println("("+i+","+(i+k-1)+"-->"+sliding_sum);
}
  }
}


