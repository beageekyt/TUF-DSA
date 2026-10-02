package org.dsa.graph;

import java.util.*;

public class DfsBfsWithAdjacencyMatrix {
    public static void dfs(int node, List<Integer> dfs,int[][] matrix, boolean[] visited ) {
        dfs.add(node);
        visited[node] = true;
        for(int i = 0; i < matrix[node].length ;i++) {
            if(matrix[node][i] == 1 && !visited[i]) {
                dfs(i, dfs, matrix, visited);
            }
        }
    }

    public static void bfs(int node, List<Integer> bfs, int[][] matrix, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while(!queue.isEmpty()) {
            node = queue.poll();
            bfs.add(node);
            for(int i = 0;i< matrix[node].length;i++) {
                if(!visited[i] && matrix[node][i] == 1){
                    visited[i] = true;
                    queue.add(i);
                }

            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 0},
                        {1, 0, 0, 1},
                        {1, 0, 0, 0},
                        {0, 1, 0, 0}};
        List<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[matrix.length+1];
        dfs(0, dfs, matrix, visited);
        System.out.println("dfs");
        for(int i : dfs) {
            System.out.println(i);
        }
        List<Integer> bfs = new ArrayList<>();
        boolean[] bfsVisited = new boolean[matrix.length+1];
        System.out.println("bfs:");
        bfs(0, bfs, matrix, bfsVisited);
        for(int i : bfs) {
            System.out.println(i);
        }

    }
}
