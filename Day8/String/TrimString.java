package Day8.String;

public class TrimString {
  public static void main(String[] args) {
    trim("Helloo  World");
  }
  public static void trim(String s){
  //  String s="Hello Word";
    String str[]=s.split("  ");
    for(String s1:str){
      System.out.println(s);
    }
  }
}
