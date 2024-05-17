package Day3.Pattern_Printing;

public class Pattern6 {
  public static void main(String[] args) {
    pattern(5);
  }
  static void pattern(int n){
    int count=0;
    for(int rows=0;rows<2*n-1;rows++){
      for(int spaces=0;spaces<(2*rows)-(4*count);spaces++){
System.out.print("  ");
      }
    
      
      for(int stars=0;stars<(n-rows)+(2*count);stars++){
System.out.print(" *");
      }
      if(rows>=n-1){
        count+=1;
      }
      System.out.println();
    }

  }
  
}
