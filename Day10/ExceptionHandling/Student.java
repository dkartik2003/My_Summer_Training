
  package Day10.ExceptionHandling;//Exception is a class like error but exception can b hadled but error cannot be resolved.

import javax.lang.model.element.Name;

public class Student {
  String name;
  int age;
  Student(String name,int age){
    this.name=name;
    this.age=age;
  }
  public void setAge(int age) throws Exception{
    try{
      if(age<0){
        throw new Exception("Age cannot be negative");
      }
      this.age=age;
    }
    catch(Exception e){
      System.out.println(e);
    }
   

  }
  public void setName(String name){
    this.name=name;

  }
  public int getAge(){
return age;
    
  }
  public String getName(){
    return name;
        
    }
}
