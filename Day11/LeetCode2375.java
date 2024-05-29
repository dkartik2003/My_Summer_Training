package Day11;

import java.util.Stack;

public class LeetCode2375 {
  public void prob(String pattern) {
    int n = pattern.length();
    int a[] = new int[n + 1];
    int count = 0;
    Stack<Integer> sc = new Stack<>();
    for (int i = 0; i < a.length; i++) {
      if (i == n || pattern.charAt(i) == 'I') {
        a[i] = count;
        count++;
        while (!sc.isEmpty()) {
          a[sc.pop()] = count;
          count++;
        }
      } else {
          sc.push(i);
      }
    }
    String s = "";
    for (int i = 0; i < a.length; i++) {
      s = s + a[i];
    }
    System.out.println(s);
  }

  public static void main(String[] args) {
    LeetCode2375 ls= new LeetCode2375();
    ls.prob("IID");
  }
}
