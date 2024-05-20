
package Day4;
import java.util.*;

class Fibonnacci{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int n=0;
   int n1=1;
   System.out.println("Enter the range: ");
   int input=sc.nextInt();
   for(int i=0;i<input;i++){
    
    int sum=n+n1;
    n=n1;
    n1=sum;
System.out.println(n);
    
   
   }
   System.out.print("Fibonnacci is "+ n);
  }
}