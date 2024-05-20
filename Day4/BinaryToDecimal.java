package Day4;

public class BinaryToDecimal {
  public static void main(String[] args) {
    BinaryToDecimal(43);

    }
    static void BinaryToDecimal(int n){
     int  sum=0;
     int  mul=1;
     while(n>0){
      int rem=n%10;
      sum=sum+rem*mul;
      mul=mul*2;
      n=n/10;
      System.out.println(sum);

     }
   
     


    }
}

