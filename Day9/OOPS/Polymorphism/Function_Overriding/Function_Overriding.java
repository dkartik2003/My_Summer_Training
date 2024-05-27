package Day9.OOPS.Polymorphism.Function_Overriding;

public class Function_Overriding {//Function overriding is a when we want to change the operation or working of the function/method.function name and parameters pass must be same.
  public void Add(){
    int a=10;
    int b=20;
    System.out.println(a+b);
  }
}
class OverridingClient extends Function_Overriding{
  @Override
  public void Add(){
    int a=10;
    int b=20;
    int c=20;

    System.out.println(a+b+c);
  }
}