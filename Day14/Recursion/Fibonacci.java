package Day14.Recursion;

public class Fibonacci {
  public static void main(String[] args) {
    int ans=fibo(6);
    System.out.println(ans);
    for(int i=0;;i++){
    if(fibo(ans)<=100)
    return ;
      System.out.println(fibo(i));
    
    }
  }
  public static int  fibo(int n){
    if(n<=1){
      return n;
    }
    int a=fibo(n-1);
    int b=fibo(n-2);
  return a+b;
  }
  
  }

