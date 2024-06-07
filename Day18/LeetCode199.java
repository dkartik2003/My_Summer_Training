package Day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Day17.LeetCode112;

public class LeetCode199 {

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

    Queue<TreeNode> q = new LinkedList<>();
    Queue<TreeNode> temp = new LinkedList<>();
    List<List<Integer>> ans = new ArrayList<>();
    if (root == null)
      return new ArrayList<>();
    q.add(root);
    List<Integer> lst = new ArrayList<>();

    while (!q.isEmpty()) {
      lst = new ArrayList<>();
      temp = new LinkedList<>();
      while (!q.isEmpty()) {
        if (q.peek().left != null)
          temp.add(q.peek().left);
        if (q.peek().right != null)
          temp.add(q.peek().right);
        lst.add(q.remove().val);
      }
      q = temp;
      ans.add(lst);
    }
    List<Integer> ll = new ArrayList<>();
    for (int i = 0; i < ans.size(); i++) {
      ll.add(ans.get(i).get(ans.get(i).size() - 1));

    }
    return ll;
  }
  public static void main(String[] args) {
    LeetCode199 tr = new LeetCode199();

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
