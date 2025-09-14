package org.dsa.arrays.medium;

import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{5,6}, {1,6},{9,10}, {2,8}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] ans = new int[intervals.length][2];
        ans[0][0] = intervals[0][0];

        ans[0][1] = intervals[0][1];
        int k = 0;
        for(int i= 1; i< intervals.length ;i++){
            if(ans[k][1] >= intervals[i][0])
            {
                ans[k][0] = Math.min(intervals[i][0], ans[k][0]);
                ans[k][1] = Math.max(intervals[i][1], ans[k][1]);
            } else {
                k++;
                ans[k][0] = intervals[i][0];
                ans[k][1] = intervals[i][1];
            }
        }
        int[][] result = Arrays.copyOf(ans, k + 1);

        for(int i= 0; i< result.length;i++){
            for (int j = 0 ;j < result[i].length;j++) {
                System.out.println(result[i][j]);
            }
        }

    }
}
