package Day4;

public class HCF {
  public static void main(String[] args) {
  int a = 9, b = 88;
while(b%a!=0){
  int rem =b%a;
  
  b=a;
  a=rem;

}
System.out.println(a);
  }
}
