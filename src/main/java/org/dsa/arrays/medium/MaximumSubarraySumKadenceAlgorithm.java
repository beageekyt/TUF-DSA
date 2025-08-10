package org.dsa.arrays.medium;

public class MaximumSubarraySumKadenceAlgorithm {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            maxSum = Math.max(sum, maxSum);
            sum = Math.max(sum, 0);
        }
        System.out.println(maxSum);
    }
}
