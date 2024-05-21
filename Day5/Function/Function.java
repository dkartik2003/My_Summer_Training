package Day5.Function;

public class Function {
  public static void main(String[] args) {
    System.out.println(Add());//function calling
  }
  public static int  Add(){//function declaration with no parameterized which is called as on parameterized
    int a =1;//function defination
    int b =3;//function defination
    int c =a+b;//function defination
    return c;// here if we return a value then we have to modify it in the function

    //System.out.println(c);//function defination
  }
}


// public class Function {
//   public static void main(String args[]){
//     add(1,3);
//   }
//   public static int add(int a,int b){ //Here it is a parameterized function
//     return a+b;
//   }
// }

