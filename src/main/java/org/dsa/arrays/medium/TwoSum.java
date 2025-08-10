package org.dsa.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum==target) {
                ans[0] = map.get(nums[i]);
                ans[1] = map.get(nums[j]);
                break;
            } else if (sum < target) {
                i++;
            }else {
                j--;
            }
        }

        for(int k : ans){
            System.out.println(k);
        }
    }

}
