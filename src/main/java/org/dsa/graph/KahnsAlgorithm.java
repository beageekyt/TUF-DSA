package org.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnsAlgorithm {
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

        int[] inDegree = new int[V];


        for(int i = 0;i< adj.size();i++){
            for(int j : adj.get(i)) {
                inDegree[j]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i < V;i++) {
            if(inDegree[i] == 0) {
                queue.add(i);
            }
        }
        ArrayList<Integer> order = new ArrayList<>();

        while(!queue.isEmpty()) {
            int elem = queue.poll() ;
            order.add(elem);
            ArrayList<Integer> list = adj.get(elem);
            for(int i : list) {
                inDegree[i]--;
                if(inDegree[i]==0) {
                    queue.add(i);
                }
            }
        }
        System.out.println("Kehn's Algorithm: ");
        for(int i : order) {
            System.out.print(i + ", ");
        }
    }
}
