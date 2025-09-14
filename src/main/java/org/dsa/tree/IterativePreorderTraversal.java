package org.dsa.tree;

import com.sun.source.tree.Tree;

import java.util.*;

public class IterativePreorderTraversal {
    public static void main(String[] args) {
        TreeNode trees = new TreeNode(5);
        trees.left = new TreeNode(8);
        trees.right = new TreeNode(3);
        trees.left.left = new TreeNode(1);
        trees.left.right = new TreeNode(12);
        trees.right.right = new TreeNode(7);
        trees.right.left = new TreeNode(11);

        Stack<TreeNode> stack = new Stack<>();
        stack.add(trees);
        List<Integer> result = new ArrayList<>();
        while (stack.size() != 0) {
            TreeNode treeNode = stack.pop();
            result.add(treeNode.val);
            if(treeNode.right != null) stack.add(treeNode.right);
            if(treeNode.left != null) stack.add(treeNode.left);
        }

        System.out.println(result.toString());
    }
}
