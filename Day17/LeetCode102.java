package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102 {
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

  public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> q=new LinkedList<>();
    Queue<TreeNode> temp=new LinkedList<>();
    List<List<Integer>> ans=new ArrayList<>();
    if(root==null)
        return ans;
    q.add(root);
    List<Integer> lst=new ArrayList<>();

    while(!q.isEmpty()){
        lst=new ArrayList<>();
        temp=new LinkedList<>();
        while(!q.isEmpty()){
            if(q.peek().left!=null)
                temp.add(q.peek().left);
            if(q.peek().right!=null)
                temp.add(q.peek().right);
            lst.add(q.remove().val);
        }
        q=temp;
        ans.add(lst);
    }
    return ans;

}

  public static void main(String[] args) {
    LeetCode102 tr = new LeetCode102();
    TreeNode root = tr.new TreeNode(3);
    root.left = tr.new TreeNode(4);
    root.right = tr.new TreeNode(8);
    root.left.left = tr.new TreeNode(11);
    root.right.left = tr.new TreeNode(13);
    root.right.right = tr.new TreeNode(4);
    root.left.left.left = tr.new TreeNode(7);
    root.left.left.right = tr.new TreeNode(2);
    root.right.right.right = tr.new TreeNode(1);

    List<List<Integer>> result = tr.levelOrder(root);
    System.out.println(result);
  }
}
