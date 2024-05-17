package Day3.Pattern_Printing;

public class Pattern5 {
  public static void main(String[] args) {
    int n=5;
    int count=0;
    for(int rows=0;rows<2*n-1;rows++){
      for(int stars=0;stars<(rows+1)-2*count;stars++){
System.out.print("* ");
      }
      if(rows>=n-1){
        count+=1;
      }
      for(int space=0;space<n-rows-1;space++){
System.out.print("  ");
      }
      System.out.println();
    }
    
  }
  
}
