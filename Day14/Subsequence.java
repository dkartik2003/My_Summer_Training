package Day14;

import java.util.Scanner;

public class Subsequence {
  static int count = 0;

  public static void main(String[] args) {
    
    subseq("abc", "_");
    System.out.println(count);

  }

  public static void subseq(String s, String ans) {
    if (s.length() == 0) {
      System.out.println(ans);
      count++;
      return;

    }
    char ch = s.charAt(0);
    subseq(s.substring(1), ans);
    subseq(s.substring(1), ans + ch);

  }
}
