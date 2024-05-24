package Day8.String;

public class PalindromeString {

  public static boolean palindrome(String s){
    int start=0;
    int end=s.length()-1;
    while(start<=end){
      if(s.charAt(start)!=s.charAt(end)){
          return false;
      }
        
      end--;
          start++;
   
  
    }
    
  return true;
  }

  public static void main(String[] args) {
    palindrome("maaddam");
    

  }

}
