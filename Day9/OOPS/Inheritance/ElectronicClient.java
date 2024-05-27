package Day9.OOPS.Inheritance;
class Electronic extends Object {
  public void on_off(){
    System.out.println("Electronic is ON/OFF");
  }
}
class Nokia extends Electronic{
  public void call(){
    System.out.println("Call");
  }
}
 class SmartPhn extends Nokia{
  public void camera(){
    System.out.println("Camera");
  }
}
public class ElectronicClient{
  public static void main(String[] args) {
SmartPhn ss= new SmartPhn();
// System.out.println(ss.on_off());

}
}

