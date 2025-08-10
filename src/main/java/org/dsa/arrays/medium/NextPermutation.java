package org.dsa.arrays.medium;


import java.util.Arrays;
import java.util.Collections;

/*
first we will find the first break point from the last means first value from the last which is not
increasing order.
then we took that value and get the smallest and greater then the breakpoint value from the right hand
array and then swap them after that we will sort the right side of the array and we are good to go.
 */
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4, 3, 0, 0};
        int breakPoint =-1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                breakPoint = i-1;
                break;
            }
        }
        if(breakPoint == -1){
            nums = reverse(nums, 0 , nums.length-1);
        } else {
            int lowest= nums[breakPoint+1];
            int lowestIndex = breakPoint+1 ;
            for (int i = breakPoint+1 ;i<nums.length;i++){
                if(lowest>nums[i] && nums[i]>nums[breakPoint]){
                    lowestIndex = i;
                    lowest = nums[i];
                }
            }
            int temp = nums[breakPoint];
            nums[breakPoint] = nums[lowestIndex];
            nums[lowestIndex] = temp;
            Arrays.sort(nums, breakPoint +1, nums.length);
        }
        for (int i : nums)
            System.out.println(i);
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
