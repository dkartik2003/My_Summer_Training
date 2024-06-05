package Day16;

import java.util.HashMap;

public class LeetCode1 {
  public int[] twoSum(int[] a, int tar) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int ans[] = new int[2];
    int n = a.length;
    for (int i = 0; i < n; i++) {
      if (map.containsKey(tar - a[i])) {
        ans[0] = a[i];
        ans[1] = map.get(tar - a[i]);
        ans[i] = i;
        return ans;
      } else {
        map.put(a[i], i);
      }

    }
    return ans;
  }

}
