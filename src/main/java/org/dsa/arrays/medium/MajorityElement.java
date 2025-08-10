package org.dsa.arrays.medium;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,3,1};
        int frequency = 1;
        int majorityElement = nums[0] ;
        for (int i = 1 ; i < nums.length ; i++) {
            if(nums[i] == majorityElement) {
                frequency ++;
            } else {
                frequency --;
                if (frequency ==0) {
                    majorityElement = nums[i];
                    frequency = 1;
                }
            }
        }
        System.out.println(majorityElement);
    }
}
