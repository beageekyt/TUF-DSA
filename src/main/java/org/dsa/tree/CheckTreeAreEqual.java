package org.dsa.tree;

import java.util.ArrayList;
import java.util.List;

public class CheckTreeAreEqual {

    public static void preOrder(TreeNode trees, List<Integer> order) {
        if(trees == null){
            return;
        }

        order.add(trees.val);
        preOrder(trees.left, order);
        preOrder(trees.right, order);
    }

    public static void main(String[] args) {
        TreeNode trees1 = new TreeNode(5);
        trees1.left = new TreeNode(8);
        trees1.right = new TreeNode(3);
        trees1.left.left = new TreeNode(1);
        trees1.left.right = new TreeNode(12);
        trees1.right.right = new TreeNode(7);
        trees1.right.left = new TreeNode(11);

        TreeNode trees2 = new TreeNode(5);
        trees2.left = new TreeNode(8);
        trees2.right = new TreeNode(3);
        trees2.left.left = new TreeNode(1);
        trees2.left.right = new TreeNode(12);
        trees2.right.right = new TreeNode(7);
        trees2.right.left = new TreeNode(111);

        List<Integer> order1 =new ArrayList<>();
        preOrder(trees1, order1);

        List<Integer> order2 =new ArrayList<>();
        preOrder(trees2, order2);

        System.out.println(order1.equals(order2));




    }
}
