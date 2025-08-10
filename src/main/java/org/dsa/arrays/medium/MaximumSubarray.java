package org.dsa.arrays.medium;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                endIndex = i;
            }
            if (sum < 0) {
                sum = 0;
                startIndex = i+1;
                endIndex = i+1;
            }
        }
        System.out.println(maxSum);
        System.out.println(startIndex);
        System.out.println(endIndex);
    }
}
