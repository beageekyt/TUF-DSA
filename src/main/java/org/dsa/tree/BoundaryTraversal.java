package org.dsa.tree;

import com.sun.source.tree.Tree;

import java.util.*;

public class BoundaryTraversal {
    public static void leafNodes(TreeNode root, List<Integer> leafNodes) {

        if(root == null) return;

        if(root.left == null && root.right == null ) {
            leafNodes.add(root.val);
        }

        leafNodes(root.left, leafNodes);
        leafNodes(root.right, leafNodes);

        return;
    }

    public static void wallNodes(TreeNode root, List<Integer> wallNodes) {
        if(root == null) return;

        if(root.left != null || root.right != null )
            wallNodes.add(root.val);

        if(root.left != null)
            wallNodes(root.left, wallNodes);
        else if(root.right != null)
            wallNodes(root.right, wallNodes);

        return;
    }

    public static void rightWall(TreeNode root, List<Integer> rightWall) {
        if(root == null) return;
        if(root.left != null || root.right != null )
            rightWall.add(root.val);

        if(root.right != null)
            rightWall(root.right, rightWall);
        else if(root.left != null)
            rightWall(root.left, rightWall);

        return;
    }
    public static void main(String[] args) {
        TreeNode trees = new TreeNode(5);
        trees.left = new TreeNode(8);
        trees.right = new TreeNode(3);
        trees.left.left = new TreeNode(1);
        trees.left.right = new TreeNode(12);
        trees.right.right = new TreeNode(7);
        trees.right.left = new TreeNode(11);
        trees.left.left.right = new TreeNode(111);

        List<Integer> wallNodes = new ArrayList<>();
        wallNodes(trees, wallNodes);
        leafNodes(trees, wallNodes);

        List<Integer> rightWall = new ArrayList<>();
        rightWall(trees, rightWall);

        System.out.println(wallNodes.toString());
        for (int i = 1 ; i<rightWall.size();i++)
            wallNodes.add(rightWall.get(i));

//        Collections.reverse(rightWall);
//        System.out.println(rightWall.toString());




    }
}
