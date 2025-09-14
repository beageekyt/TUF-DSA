package org.dsa.tree;

public class PreOrderTraversal {
    public static void preOrder(TreeNode trees) {
        if(trees == null){
            return;
        }

        System.out.println(trees.val);

        preOrder(trees.left);
        preOrder(trees.right);
    }

    public static void main(String[] args) {
        TreeNode trees = new TreeNode(5);
        trees.left = new TreeNode(8);
        trees.right = new TreeNode(3);
        trees.left.left = new TreeNode(1);
        trees.left.right = new TreeNode(12);
        trees.right.right = new TreeNode(7);
        trees.right.left = new TreeNode(11);

        preOrder(trees);
    }
}
