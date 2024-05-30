package Day12;

// import java.util.Arrays;
import java.util.Stack;
import java.util.*;

public class NextGreaterElement {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }
  Stack<Integer> ls = new Stack<>();
  int[] ans = new int[n];
  for(int i=0;i<n;i++){
    if(ls.isEmpty()) {
      ls.push(i);
  }else{
    if(a[ls.peek()]<a[i]){
      while(!ls.isEmpty() && a[ls.peek()]<a[i]){
        int pos=ls.pop();
        ans[pos]=a[i];

      }
      ls.push(i);
    }else{
      ls.push(i);
    }


    }
  }
  while(!ls.isEmpty()){
    // int pos=ls.pop();
    // ans[pos]=-1;
    ans[ls.pop()]=-1;

  }

  for(int i=0;i<n;i++){
    System.out.print(ans[i]+" ");
  }
 }
}
