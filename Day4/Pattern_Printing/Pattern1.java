package Day4.Pattern_Printing;

public class Pattern1 {
  public static void main(String[] args) {
    pattern(4);
  }
  static void pattern(int n){
int x=2*n-2;
for(int rows=0;rows<=2-1;rows++){
  for(int star =0;star<rows-1;star++){
    System.out.print("* ");

  }
  
}
  }
}
