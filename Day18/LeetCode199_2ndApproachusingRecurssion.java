package Day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode199_2ndApproachusingRecurssion {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public List<Integer> rightSideView(TreeNode root) {
    HashMap<Integer, Integer> map = new HashMap<>();
    fun(root, 0, map);
    System.out.println(map);
    List<Integer> ans = new ArrayList<>();
    for (Integer i : map.keySet()) {
      ans.add(map.get(i));
    }
    return ans;
  }

  public void fun(TreeNode root, int n, HashMap<Integer, Integer> map) {
    if (root == null) {
      return;
    }
    map.put(n, root.val);
    fun(root.left, n + 1, map);
    fun(root.right, n + 1, map);
  }

  public static void main(String[] args) {
    LeetCode199_2ndApproachusingRecurssion tr = new LeetCode199_2ndApproachusingRecurssion();

    // Creating a sample tree: root = [5,4,8,11,null,13,4,7,2,null,null,null,1]
    TreeNode root = tr.new TreeNode(5);
    root.left = tr.new TreeNode(4);
    root.right = tr.new TreeNode(8);
    root.left.left = tr.new TreeNode(11);
    root.right.left = tr.new TreeNode(13);
    root.right.right = tr.new TreeNode(4);
    root.left.left.left = tr.new TreeNode(7);
    root.left.left.right = tr.new TreeNode(2);
    root.right.right.right = tr.new TreeNode(1);

    System.out.println(tr.rightSideView(root));
  }
}
