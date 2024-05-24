package Day8.String;

public class StringExample {
  public static void main(String[] args) {
    String s1 = "Hello World";
    String s2 = "Hello World";
    String s3 = new String("Hello World");
    String s4 = new String("Hello World");

    System.out.println(s1 == s2);    // true, because s1 and s2 refer to the same string literal in the string pool
    System.out.println(s1 == s3);    // false, because s1 and s3 refer to different objects
    System.out.println(s3 == s4);    // false, because s3 and s4 refer to different objects

    String s = "hello";
    char ch = s.charAt(0);     // charAt requires an index argument
    System.out.println(ch);          // prints 'h'
  }
}
