package org.dsa.slidingWindowTwoPointer;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int l = 0, r = 0, zero = 0;
        int max = 0;
        for (; r <  nums.length; r++) {
            if(nums[r] == 0 ) {
                zero++;
                while(zero>k) {
                    if(nums[l] == 0) {
                        zero--;
                    }
                    l++;
                }
            }
            max = Math.max(max, r-l +1 );
            System.out.println("left:"+ l + "right:" + r);
        }
        System.out.println(max);
    }
}
