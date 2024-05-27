package Day9.OOPS.Abstraction;

public abstract class Abstraction_Demo {
  public abstract void Payment(); 
  public abstract void View_Order(); 
  public void list(){

  }
  Abstraction_Demo(){
    System.out.println("I am Abstraction Demo constructor");
  }
}
//If a class is abstract then it may have abstract and non abstract method but an abstract method must be within abstract class.
//An abstract class cannot have an object/child class.
//abstract method must be overriden in the child class.
//Constructor chaining the process when constructor calls another constructor and so on this goes on then it is called so.
