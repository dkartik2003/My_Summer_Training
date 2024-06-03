package Day14;

public class LeetCode1137 {
  public static void main(String[] args) {
    System.out.println(triboanncci(6));
  }
  public static int triboanncci(int n){
    if(n==0||n==1||n==3){
      return n;


    }
    return triboanncci(n-1)+triboanncci(n-1)+triboanncci(n-3);

  }
}
