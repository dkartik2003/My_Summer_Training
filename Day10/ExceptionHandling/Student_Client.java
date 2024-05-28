package Day10.ExceptionHandling;

public class Student_Client {
  public static void main(String[] args) {
    Student s= new Student("Kartik",34);
    s.setName("Rahul");
    System.out.println(s.getRoll());
  }
}
