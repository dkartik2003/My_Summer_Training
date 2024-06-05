package Day16;

import java.util.*;

public class LeetCode3 {
  public int lengthOfLongestSubstring(String s) {
    char[] ch = s.toCharArray(); // Corrected: char[] instead of char

    int n = ch.length;
    int r = 0;
    int l = 0;
    int ans = 0; // Corrected: initialize ans to 0
    HashSet<Character> set = new HashSet<>();
    
    while (r < n) { // Corrected: only need to check r < n in the while condition
      if (set.contains(ch[r])) {
        while (l <= r && set.contains(ch[r])) {
          set.remove(ch[l]);
          l++;
        }
      }
      
      set.add(ch[r]); // Moved this outside the inner while loop
      ans = Math.max(set.size(), ans); // Update ans after adding the new character
      r++;
    }
    return ans;
  }
}

//   public static void main(String[] args) {
//     LeetCode3 solution = new LeetCode3();
//     String test = "abcabcbb";
//     System.out.println("Length of the longest substring without repeating characters: " + solution.lengthOfLongestSubstring(test));
//   }
// }
