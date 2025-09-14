package org.dsa.slidingWindowTwoPointer;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int l = 0 , r = 0;
        int maxLength = 0;
        int flag = 0;
        for(;r < nums.length; r++) {
            if(nums[r] == 1) {
                if(flag == 0)
                    l = r;
                flag = 1;
            }
            else {
                if(flag == 1) {
                    maxLength = Math.max(maxLength, r-l);
                }
                flag = 0;
            }
        }
        if(flag == 1)
            maxLength = Math.max(maxLength, r-l);
        System.out.println(maxLength);

    }
}
