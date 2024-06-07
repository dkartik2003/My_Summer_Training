package Day18;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode515 {



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
  public List<Integer> largestValues(TreeNode root) {
    if (root == null) {
        return new ArrayList<>();
    }

    Queue<TreeNode> q = new LinkedList<>();
    List<Integer> largestValues = new ArrayList<>();
    q.add(root);

    while (!q.isEmpty()) {
        int ls = q.size();
        int max = Integer.MIN_VALUE;

        for (int i = 0;i<ls; i++) {
            TreeNode currentNode = q.poll();
            if (currentNode.val > max) {
                max = currentNode.val;
            }

            if (currentNode.left != null) {
                q.add(currentNode.left);
            }

            if (currentNode.right != null) {
                q.add(currentNode.right);
            }
        }

        largestValues.add(max);
    }

    return largestValues;
}
public static void main(String[] args) {
  LeetCode515 tr=new LeetCode515();
  TreeNode root = tr.new TreeNode(3);
  root.left = tr.new TreeNode(4);
  root.right = tr.new TreeNode(8);
  root.left.left = tr.new TreeNode(11);
  root.right.left = tr.new TreeNode(13);
  root.right.right = tr.new TreeNode(4);
  root.left.left.left = tr.new TreeNode(7);
  root.left.left.right = tr.new TreeNode(2);
  root.right.right.right = tr.new TreeNode(1);

List<Integer> result = tr.largestValues(root);
  System.out.println(result);
}

 
 

 
}

//OR
// 
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//   public List<Integer> largestValues(TreeNode root) {
//      Queue<TreeNode> q=new LinkedList<>();
//       Queue<TreeNode> temp=new LinkedList<>();
//       List<Integer> ans=new ArrayList<>();
//       if(root==null)
//           return ans;
//       q.add(root);
//       List<Integer> lst=new ArrayList<>();

//       while(!q.isEmpty()){
//           lst=new ArrayList<>();
//           temp=new LinkedList<>();
//           int max=Integer.MIN_VALUE;                                        
//           while(!q.isEmpty()){
//               if(q.peek().left!=null)
//                   temp.add(q.peek().left);
//               if(q.peek().right!=null)
//                   temp.add(q.peek().right);
//               max=Math.max(max,q.peek().val);
//               lst.add(q.remove().val);
//           }
//           q=temp;
//           ans.add(max);
//       }
//       return ans;
//   }
// }

