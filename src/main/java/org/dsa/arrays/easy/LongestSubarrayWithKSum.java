package org.dsa.arrays.easy;

public class LongestSubarrayWithKSum {
    public static void main(String[] args) {
        int[] nums = {-1, 1, 1};
        int k = 1;
        int ans = 0;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum==k) {
                ans = Math.max(ans, i - j + 1);
                sum = sum - nums[j];
                j++;
                continue;
            }
            if (sum > k) {
                sum = sum - nums[j];
                j++;
            }

        }
        System.out.println(ans);

    }
}
