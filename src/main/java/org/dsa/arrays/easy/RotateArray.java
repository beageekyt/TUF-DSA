package org.dsa.arrays.easy;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        nums = reverse(nums, 0, nums.length - 1);
        k = k % nums.length;
        System.out.println(k);
        nums = reverse(nums,0,k-1);
        for (int i : nums) {
            System.out.print(i+ " ");
        }
        System.out.println();
        nums = reverse(nums,k , nums.length-1);

        for (int i : nums) {
            System.out.print(i+ " ");
        }
    }

    public static int[] reverse(int[] nums, int start, int end) {
        int temp;
        for (; start <= end; start++, end--) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        return nums;
    }
}
