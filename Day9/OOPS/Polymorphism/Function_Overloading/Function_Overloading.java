package Day9.OOPS.Polymorphism.Function_Overloading;//Function overloading is a when the class name syntax and return type of the function is same but the parameters are different.Compile time Polymorphism

import java.util.*;
public class Function_Overloading extends Object{
  public void Add(){
    int a=10;
    int b=20;

  }
  public void Add(int a,int b){
    System.out.println(a+b);
  }
  public void Add(double a,double b){
    System.out.println(a+b);
  }
  public void Add(int a, int ...c){//This is known as tripple dot operator which is used to take many parameters and it is stored in the form of array and hence we can seen this by understanding the below code
    int sum=0;
    for(int i=0;i<c.length;i++){
      sum+=c[i];

    }
    System.out.println(sum);

  }
  public static void main(String[] args) {
    Function_Overloading sc = new Function_Overloading ();
    sc.Add();
      sc.Add(10,10,23,33,33,33,45);
      sc.Add(44,44);
      sc.Add(2.3,334.4);
  }
}
