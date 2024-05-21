package Day5;

public class TypeCasting {
  public static void main(String[] args) {
    // Type Casting
    int a=045;
    System.out.println(a);
    byte b=12;
    System.out.println(b);
    // byte b1=128;  this will show data loss 
    // System.out.println(b1);
     byte b1=(byte)128;  //this will show data loss 
    System.out.println(b1);//  -128 this is shown in minus as binary form is 10000000 and msb is 1 so it is negetive
 byte b2=(byte)140; //here we have converted it into binary and into 1s and 2s compliment and conveett it it into decimal so op is -116
    System.out.println(b2);
    int a1=12;
    System.out.println(a1);
    byte b3 =(byte)300;
    System.out.println(b3);
    // float fl=(float)9.9;
    // System.out.println(f1);


    char ch='a';
    System.out.println(ch);
    char ch1='A';
    System.out.println(+ch1);


    char ch2='A';
    System.out.println(ch2+1);
    ch2++;//ch=(ch1)(ch+1)
    System.out.println(ch2);

  }
}
