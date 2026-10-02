package org.dsa.graph;

public class FloodFill {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}};
        int [][] newMatrix = floodFill(matrix, 1, 1, 2);
        System.out.println("dfs");
    }

    public static int[][] dfs(int[][] image, int sr, int sc, int color, int ic, int[][] visited){
        image[sr][sc] = color;
        visited[sr][sc] = 1;
        if(sr-1>=0 && visited[sr-1][sc] == 0 && image[sr-1][sc] == ic)
        {
            image = dfs(image, sr-1, sc,color, ic, visited);
        }
        if(sc-1>=0 && visited[sr][sc-1] == 0 && image[sr][sc-1] == ic)
        {
           image =  dfs(image, sr, sc-1, color, ic, visited);
        }
        if(sc+1<image[sr].length && visited[sr][sc+1] == 0 && image[sr][sc+1] == ic)
        {
           image = dfs(image, sr, sc+1, color, ic, visited);
        }
        if(sr+1<image.length && visited[sr+1][sc] == 0 && image[sr+1][sc] == ic)
        {
            image = dfs(image, sr+1, sc, color, ic, visited);
        }
        return image;
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] visited = new int[image.length][image[0].length];
        return dfs(image, sr, sc, color, image[sr][sc], visited);
    }
}
