package Day16.Trees;

import java.util.*;

public class Trees1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Tree tr = new Tree(a);// constructor calling
    System.out.println("nOrder");
    tr.InOrder(tr.root);

    System.out.println();
    System.out.println("PreOrder");

    tr.PreOrder(tr.root);
    System.out.println();
    System.out.println("PostOrder");

    tr.PostOrder(tr.root);
    System.out.println();

  }
}

class Node {
  int val;
  Node left;
  Node right;

  Node(int val) {
    this.val = val;
  }
}

class Tree {
  Node root;// root node variable

  public Tree(int a[]) {
    root = buildTree(0, a);

  }

  public Node buildTree(int ind, int a[]) {
    if (ind >= a.length) {
      return null;
    } else {
      Node newnode = new Node(a[ind]);
      // l=(2*ind+1)

      newnode.left = buildTree(2 * ind + 1, a);
      // r=(2*ind+2)

      newnode.right = buildTree(2 * ind + 2, a);
      return newnode;
    }
  }

  public void InOrder(Node root) {
    if (root == null) {
      return;
    }
    InOrder(root.left);
    System.out.print(root.val);
    InOrder(root.right);

  }

  public void PreOrder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print("PreOrder: " + root.val);
    PreOrder(root.left);
    PreOrder(root.right);
  }

  public void PostOrder(Node root) {
    if (root == null) {
      return;
    }
    PreOrder(root.left);
    PreOrder(root.right);
    System.out.print(root.val);

  }
}
