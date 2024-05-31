package Queue;

public class QueueImpl {
  int arr[];
  int front=0;
  int size=0;
  QueueImpl(){
    arr=new int[5];
  }
  public void Enqueue(int data) throws Exception{ 
    if(){
      throw new Exception("Queue is overflowed");
    }
    int index=front+size;
    arr[index]=data;
    size++;
  }
  public int Dequeue() throws Exception{
    if(isEmpty()){
      throw new  Exception ("Queue is underflow")
;


    }
    int rv = arr[front];
    front++;
    size--;
    return rv;
  }
  public boolean isEmpty(){
    return size=0;

  }
  public boolean isFull(){
    return size=arr.length;

  }
  public void display(){
for(int i=0;i<size;i++){
  int index=front+i;
  System.out.println(arr[index]+" ");
}

}
  }
  public static void main(String[] args) {
    
  }
}
