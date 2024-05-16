package Day2.Conversion;

public class DecimalToBinary {
  public static void main(String[] args) {
    int decimal=35;
    int sum=0;
    int mul=1;
    while(decimal>0){
      int rem =decimal%2;
      sum=sum+rem*mul;
      mul=mul*10;
      decimal/=2;


    }
    System.out.println(sum);
  }
}
