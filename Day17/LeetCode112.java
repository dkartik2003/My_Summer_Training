package Day17;

public class LeetCode112 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) { 
            this.val = val; 
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int target) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && target - root.val == 0) {
            return true;
        }

        boolean ansl = hasPathSum(root.left, target - root.val);
        boolean ansr = hasPathSum(root.right, target - root.val);

        return ansl || ansr;
    }

    public static void main(String[] args) {
        LeetCode112 tr = new LeetCode112();

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

        int targetSum = 22;
        System.out.println(tr.hasPathSum(root, targetSum));  // Output should be true if there's a valid path
    }
}
