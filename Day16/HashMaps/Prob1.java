package Day16.HashMaps;

import java.util.*;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the elements:");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < s; i++) {
            if (hm.containsKey(arr[i])) {
                int count = hm.get(arr[i]);
                hm.put(arr[i], count + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println("Count of Unique elements: " + hm.size());
        System.out.println(hm);
        for(Integer i:hm.keySet()){
          System.out.println("Key "+i+",CountValue "+hm.get(i));
        }

    }
}
