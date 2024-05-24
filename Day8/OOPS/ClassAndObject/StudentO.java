package Day8.OOPS.ClassAndObject;

public class StudentO {
  public static void main(String[] args) {
    Students s= new Students("kartik",23);
    Students s1= new Students("om",22);
  //executed in Compile time  = // executed in Runtime   
    System.out.println(s.age);
    System.out.println(s1.age);



  }
  static  {
    System.out.println("null");

  }
}
