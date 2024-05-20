package Day4;

public class Factors {
  public static void main(String[] args) {
    int n = 5;
    int c = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.println(i + " ");
        c++;
      }
    }
    System.out.println("Total number of factorials are: "+c);
  }
}
