package Day17.Trees;

public class Prob1 {
  public static void main(String[] args) {
    int a[] = { 3, 45, 15, 25 };
    int n = a.length;
    Prob1 p = new Prob1();
    int sum = (p.sum(a, n - 1));
  }

  public int sum(int a[], int n) {

    int totalsum = 0;
    if (n == 0) {
      return 1;
    }
    return a[n] + sum(a, n - 1);

    // return sum;
  }
  public int sum(int[] a, int start, int end) {
    if (start > end) {
      return 0;
    }
    return a[start] + sum(a, start + 1, end);
  }

  }

