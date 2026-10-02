package org.dsa.graph;

import java.util.ArrayList;

/*
Cycle Detection in Directed Graph (DFS)
In a directed graph, we cannot use the parent node to detect a cycle.
Reason:
A directed edge only goes in one direction, so encountering a visited node
does not necessarily mean we came back through the same edge.
Instead, we maintain two arrays.
1. visited[]
   - Tells whether the node has ever been visited in any DFS.
   - Prevents revisiting already explored subgraphs.
2. pathVisited[]
   - Tells whether the node is part of the current DFS recursion path.
   - Represents the current call stack.
While exploring a node:
- Mark it as visited.
- Mark it in the current path.
For every neighbour:
1. If the neighbour is unvisited,
   continue DFS.
2. If the neighbour is already in the current path,
   then we have reached one of our ancestors.
   This forms a back edge.
   A back edge in a directed graph always indicates a cycle.
After exploring all neighbours,
remove the current node from the current path
before returning.
This backtracking step is important because the node
is no longer part of the active DFS path.
 */

public class CycleDetectionInDirectedGraphDFS {

    public static boolean cycleDetectionDfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] visited, boolean[] pathVisited) {
        visited[node] = true;
        pathVisited[node] = true;

        for(int i = 0; i < adj.get(node).size(); i++) {
            if(!visited[adj.get(node).get(i)]) {
                if(cycleDetectionDfs(adj, adj.get(node).get(i), visited, pathVisited))
                    return true;
            } else if(pathVisited[adj.get(node).get(i)])
                return true;
        }
        pathVisited[node] = false;
        return false;

    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(4).add(5);

        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];
        for(int i = 0; i < V; i++) {
            
        }
        boolean cycle = cycleDetectionDfs(adj, 0, visited, pathVisited);
        System.out.println("dfs Cycle detected: " + cycle);
    }
}
