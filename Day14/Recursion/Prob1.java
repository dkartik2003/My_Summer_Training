package Day14.Recursion;

public class Prob1 {
  public static void main(String[] args) {
    pi(5);
    rev(5);
  }
  public static void pi(int n){
    if(n==0){
return;
    }
    pi(n-1);
    System.out.println(n);
  }
  public static void rev(int n){

    System.out.println(n);
    pi(n-1);
    if(n==0){
      return;
          }
  }
}
