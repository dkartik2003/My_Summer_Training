package Day14.Recursion;

public class Prob {
  public static int fact(int n){
    while(n>0){
      return n*fact(n-1);//recursive call

    }
    return 1;//base condition
  }
  public static void main(String[] args) {
    System.out.println(fact(0));
  }
}
