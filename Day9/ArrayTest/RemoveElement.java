package Day9.ArrayTest;

public class RemoveElement {
  public static void main(String[] args) {
    int[] arr = {3,2,3,3};
    int target=3;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=target){
System.out.println(arr[i]);
      }
    }
  }
}
