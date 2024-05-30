package Day12;

import java.util.Stack;

public class LeetCode20 {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    char[] ch = s.toCharArray();
    int n = ch.length;
    
    for (int i = 0; i < n; i++) {
        if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
            stack.push(ch[i]); 
        } else {
            if (stack.isEmpty()) {
                return false;
            }
            if (ch[i] == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (ch[i] == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (ch[i] == ']' && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
    }
    if (stack.isEmpty()) {
        return true;
    } else {
        return false;
       }
    }
}
