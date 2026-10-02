package org.dsa.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int flag = 0;
        Queue<List<Integer>> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j]==2) {
                    queue.add(List.of(i, j, 0));
                    visited[i][j] = 1;
                }

            }
        }
        int time = -1;

        while (!queue.isEmpty()) {
            List<Integer> rotten = queue.poll();
            int i = rotten.get(0);
            int j = rotten.get(1);
            time = rotten.get(2);
            if (i + 1 < n && grid[i + 1][j]==1 && visited[i + 1][j]==0) {
                grid[i + 1][j] = 2;
                queue.add(List.of(i + 1, j, time + 1));
                visited[i + 1][j] = 1;
            }
            if (i - 1 >= 0 && grid[i - 1][j]==1 && visited[i - 1][j]==0) {
                grid[i - 1][j] = 2;
                queue.add(List.of(i - 1, j, time + 1));
                visited[i - 1][j] = 1;
            }
            if (j - 1 >= 0 && grid[i][j - 1]==1 && visited[i][j - 1]==0) {
                grid[i][j - 1] = 2;
                queue.add(List.of(i, j - 1, time + 1));
                visited[i][j - 1] = 1;
            }
            if (j + 1 < m && grid[i][j + 1]==1 && visited[i][j + 1]==0) {
                grid[i][j + 1] = 2;
                queue.add(List.of(i, j + 1, time + 1));
                visited[i][j + 1] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j]==1) {
                    flag = 1;
                }

            }
        }

        if(flag == 1) {
            System.out.println(-1);
        }
        System.out.println(time);
    }
}
