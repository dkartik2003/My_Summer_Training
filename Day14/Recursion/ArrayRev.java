package Day14.Recursion;

public class ArrayRev {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    revArray(arr, 0);
  }
  public static void revArray(int arr[],int index){
    if(arr.length==index){//basecondition
        return ;

    }
   revArray(arr, index+1);
   System.out.println(arr[index]+"  ");



}
}
