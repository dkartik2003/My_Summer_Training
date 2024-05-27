package Day9.OOPS.Polymorphism.Function_Overloading;

public class OverloadingOfMainMetod {
  public void Add(){
    int a=10;
    int b=20;

  }
  public void Add(int a,int b){
    System.out.println(a+b);
  }
  public void Add(int a, int ...c){//This is known as tripper dot operator which is used to take many parameters and it is stored in the form of array and hence we can seen this by understanding the below code
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
  }
  
}
