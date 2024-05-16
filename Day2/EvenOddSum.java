package Day2;
public class EvenOddSum {
    public static void main(String[] args) {
      int num = 1234;
      int sum=0;
      int rem;
      int even_sum=0;
      int odd_sum=0;
      while(num>0)
  {
     rem=num%10;
     if(rem%2==0){
  even_sum=even_sum+rem;
     }else{
odd_sum=odd_sum+rem;
     }
    sum=sum+rem;
    num=num/10;
  }  
  System.out.println("Odd Sum is: "+odd_sum);
  System.out.println("Even Sum is: "+even_sum);}
}
  
  
  
