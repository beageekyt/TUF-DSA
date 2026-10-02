package org.dsa.graph;

import java.util.*;
import java.util.List;

public class DfsBfsWithAdjacencyList {

    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visitedArray, List<Integer> dfs) {
        visitedArray[node] = 1;
        dfs.add(node);
        for (int i = 0; i < adj.get(node).size(); i++) {
            if(visitedArray[adj.get(node).get(i)] == 0) {
                dfs(adj.get(node).get(i), adj, visitedArray, dfs);
            }
        }
    }

    public static void bfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visitedArray, List<Integer> bfs) {
        Queue<Integer> que = new LinkedList<>();
        que.add(node);
        while(que.size() != 0) {
            node = que.poll();
            bfs.add(node);
            for(int i :adj.get(node)) {
                if(!visitedArray[i]) {
                    visitedArray[i] = true;
                    que.add(i);
                }

            }
        }

    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(1).add(4);
        adj.get(4).add(1);
        adj.get(2).add(5);
        adj.get(5).add(2);
        adj.get(4).add(6);
        adj.get(6).add(4);

        List<Integer> dfs = new ArrayList<>();
        int[] visitedArray = new int[7];
        dfs(0,adj,visitedArray, dfs);
        System.out.println("dfs:");
        for(int i : dfs) {
            System.out.println(i);
        }

        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[7];
        bfs(0, adj, visited, bfs);
        System.out.println("bfs:");
        for(int i : bfs) {
            System.out.println(i);
        }


    }

}
