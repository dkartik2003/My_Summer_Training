package Day9.String;
import java.util.*;
public class SubString {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String n=sc.nextLine();
    
  
    for(int i=0;i<n.length();i++){
      for(int j=i+1;j<=n.length();j++){
       
        System.out.println(n.substring(i,j));

      }
     

    }

  }
}
