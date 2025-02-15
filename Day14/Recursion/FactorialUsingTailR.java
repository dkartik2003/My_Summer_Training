package Day14.Recursion;

public class FactorialUsingTailR {
  public static void main(String[] args) {
    int n = 5;
    System.out.println(fact(n));
  }

  public static int fact(int n) {
    if (n == 0) {
      return 1;
    }
    return n*fact(n - 1);
  }
}
