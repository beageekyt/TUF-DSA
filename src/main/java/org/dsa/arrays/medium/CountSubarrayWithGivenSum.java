package org.dsa.arrays.medium;

public class CountSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        int ans = 0;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum==k) {
                ans ++;
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
