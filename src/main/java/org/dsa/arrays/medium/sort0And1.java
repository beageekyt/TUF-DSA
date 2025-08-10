package org.dsa.arrays.medium;

public class sort0And1 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 1, 0, 0, 1, 0};
        int start = 0;
        int mid = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0) {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
                mid++;
            } else {
                mid++;
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
