package Day16.HashMaps;

import java.util.HashMap;

public class Hashmap1 {
  public static void main(String[] args) {
    HashMap<Integer,String> mp = new HashMap<>();
    mp.put(21, "Kartik");
    mp.put(2, "Rimtesh");
    mp.put(111, "KIIT");//here the value is overwritten on that particular key
    mp.put(1, "Kartik");

    System.out.println(mp);
    mp.remove(111);
    System.out.println(mp);
    HashMap<String,String> mp1 = new HashMap<>();
    mp1.put("hello", "nuhahahahhahahahall");
    mp1.put("helo", "nuhahahahhahahahall");
    mp1.put("hello45", "nuhaahall");
    System.out.println(mp1);


for(Integer i:mp.keySet()){//foreach loop
  System.out.print(i+"  ");

}
System.out.println();
for(String i:mp.values()){
  System.out.println(i+"  ");
}
  }
}
