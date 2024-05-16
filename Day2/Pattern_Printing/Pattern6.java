package Day2.Pattern_Printing;

public class Pattern6 {
  public static void main(String[] args) {
    int n=5;
    for(int r=0;r<n;r++){
      for(int space=0;space<r*2;space++){//spaces
System.out.print(" ");
      }
      for(int star=0;star<n-r;star++){//stars
System.out.print("*");
      }
      System.out.println();
    }
  }
}
