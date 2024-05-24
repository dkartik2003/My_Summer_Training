package Day8.String;

public class ReverseString {
  public static void main(String[] args) {
    String s4="Kartik";
String rev="";
for(int i=s4.length()-1;i>=0;i--)
{
  rev+=s4.charAt(i);
}
  System.out.println(rev);
  }
}
