package org.dsa.arrays.medium;

public class sort0And1And2 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 2, 1, 1, 0, 2, 2, 1, 0, 0, 1, 0, 2, 1};
        int start = 0, mid = 0, end = nums.length-1, temp = 0;
        while (mid <= end) {
            if (nums[mid]==2) {
                temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            } else if (nums[mid]==0) {
                temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                start++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            }
        }
        for (int j : nums) {
            System.out.println(j);
        }

    }
}
