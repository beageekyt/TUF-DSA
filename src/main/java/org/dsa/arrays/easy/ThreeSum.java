package org.dsa.arrays.easy;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        
        HashSet<List<Integer>> answer = new HashSet<>();
        int i = 0;
        int j = i+1;
        int k = nums.length - 1;
        while(i<nums.length-2) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0){
                answer.add(List.of(nums[i], nums[j], nums[k]));
                j++;
            } else if (sum<0) {
                j++;
            } else {
                k--;
            }
            if(j>=k){
                i++;
                j=i+1;
                k=nums.length - 1;
            }

        }
         System.out.println(answer.toString());
    }
}
