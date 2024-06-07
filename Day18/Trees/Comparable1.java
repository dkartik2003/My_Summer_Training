package Day18.Trees;

import java.lang.*;
import java.util.*;

public class Comparable1 {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<pair> lst=new ArrayList<>();
    pair arr[]=new pair[n];
    for(int i=0;i<n;i++){
        int marks=sc.nextInt();
        String name=sc.next();
        int age=sc.nextInt();
        lst.add(new pair(age,name,marks));
        arr[i]=new pair(age,name,marks);
    }
    Arrays.sort(arr);
    Collections.sort(lst);
    System.out.println(arr);
    System.out.println(lst);
    for(int i=0;i<n;i++){
        System.out.println(arr[i].marks+"\t"+arr[i].name+"\t"+arr[i].age);
        //System.out.println(lst.get(i).marks+"\t"+lst.get(i).name+"\t"+lst.get(i).age);
    }

}
}

// marks name and age basis sorting
class Pair implements Comparable<Pair> {
  int age;
  int marks;
  String name;

  Pair(int age, String name, int marks) {
    this.age = age;
    this.name = name;
    this.marks = marks;

  }

  @Override
  public int compareTo(Pair o) {

    if(this.marks!=o.marks){
      return o.marks-this.marks;// ascending
  } else if (!this.name.equals(o.name)) {
      return this.name.compareTo(o.name);// ascending
  }else{
      return o.age-this.age;// descending
  }
  }
}
