package Day4;

public class PrimeNo {
  public static void main(String[] args) {
    int n = 0;
    int c = 0;
    if (n == 0) {
      System.out.println("Sorry give a legit no.");

    } else {
      for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
          // System.out.println(i + " ");
          c++;
        }
      }
      if (c == 2) {
        System.out.println("Prime ");

      } else {
        System.out.println("Not Prime");
      }

    }

  }
}
