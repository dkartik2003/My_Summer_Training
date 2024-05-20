package Day4;

public class LCM {
  public static void main(String[] args) {
    int a = 9, b = 88;
    while(b%a!=0){
      int rem =b%a;
      a=rem;
      b=a;
    
    }
    int lcm=(a*b)/a;
    System.out.println(a);
  }
}
