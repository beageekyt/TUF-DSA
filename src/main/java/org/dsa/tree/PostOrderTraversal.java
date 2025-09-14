package org.dsa.tree;

public class PostOrderTraversal {
    public static void postOrder(TreeNode trees) {
        if(trees == null){
            return;
        }

        postOrder(trees.left);
        postOrder(trees.right);

        System.out.println(trees.val);
    }

    public static void main(String[] args) {
        TreeNode trees = new TreeNode(5);
        trees.left = new TreeNode(8);
        trees.right = new TreeNode(3);
        trees.left.left = new TreeNode(1);
        trees.left.right = new TreeNode(12);
        trees.right.right = new TreeNode(7);
        trees.right.left = new TreeNode(11);

        postOrder(trees);
    }

}
