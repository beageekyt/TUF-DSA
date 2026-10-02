package org.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
In an undirected graph, every edge is stored in both directions.
Example:
1 ---- 2

Adjacency List:
1 -> {2}
2 -> {1}

Suppose we start DFS from node 1.
1 goes to 2.
Now we are at node 2.
Node 2's adjacency list contains node 1 because the graph is undirected.
Node 1 is already visited, but this DOES NOT mean there is a cycle.
Why?
Because node 1 is the node from which we just came.
It is simply the parent of node 2.
So, whenever we encounter a visited node:
1. If it is the parent, ignore it.
   It is just the reverse direction of the same edge.
2. If it is visited and NOT the parent,
   then we have reached an already explored vertex through another path.
   That means there are two different paths to reach the same node,
   which confirms the presence of a cycle.
 */

public class CycleDetectionWithDfsBfsUndirectedGraph {
    public static boolean dfsCycleDetection(boolean[] visited, ArrayList<ArrayList<Integer>> adj, int node, int parent) {
        visited[node] = true;
        for (int i = 0; i < adj.get(node).size(); i++) {
            int newNode = adj.get(node).get(i);
            if (!visited[newNode]) {
                if (dfsCycleDetection(visited, adj, newNode, node))
                    return true;
            } else if (parent!=newNode) {
                return true;
            }
        }
        return false;
    }


    public static boolean bfsCycleDetection(boolean[] visited, ArrayList<ArrayList<Integer>> adj, int node, int parent) {
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(List.of(node, parent));
        visited[node] = true;
        while (!queue.isEmpty()) {
            List<Integer> list = queue.poll();
            node = list.get(0);
            parent = list.get(1);
            for (int i : adj.get(node)) {
                if (visited[i] && parent!=i) {
                    return true;
                }
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(List.of(i, node));
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(0);
        adj.get(1).add(4);
        adj.get(2).add(0);
        adj.get(2).add(5);
        adj.get(3).add(1);
        adj.get(4).add(1);
        adj.get(4).add(6);
        adj.get(5).add(2);
        adj.get(6).add(4);

        boolean[] visited = new boolean[V];

        boolean cycleDetected = dfsCycleDetection(visited, adj, 0, -1);
        System.out.println("dfs cycle Detected:" + cycleDetected);
        visited = new boolean[V];
        cycleDetected = bfsCycleDetection(visited, adj, 0, -1);
        System.out.println("bfs cycle Detected:" + cycleDetected);

    }
}
