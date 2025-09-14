package org.dsa.tree;

import java.util.*;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode trees = new TreeNode(5);
        trees.left = new TreeNode(8);
        trees.right = new TreeNode(3);
        trees.left.left = new TreeNode(1);
        trees.left.right = new TreeNode(12);
        trees.right.right = new TreeNode(7);
        trees.right.left = new TreeNode(11);

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(trees);


        List<List<Integer>> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                if(queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            result.add(subList);
        }
        System.out.println(result.toString());
    }
}
