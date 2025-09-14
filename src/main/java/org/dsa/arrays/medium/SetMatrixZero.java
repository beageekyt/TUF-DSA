package org.dsa.arrays.medium;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int m = matrix.length;
        int n = matrix[0].length;
        int firstColumnIdentifier = matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==0) {
                    matrix[i][0] = 0; //making row tracer zero
                    if (j!=0) {
                        matrix[0][j] = 0; // making column tracer zero
                    } else {
                        firstColumnIdentifier = 0;
                    }
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (matrix[0][0]==0) {
            for (int i = 1; i < n; i++) {
                matrix[0][i] = 0;
            }
        }

        if (firstColumnIdentifier==0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
}
