package org.dsa.arrays.easy;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,1};
        int ans = 0;
        for (int i : nums){
            ans = ans ^ i;
        }
        System.out.println(ans);
    }
}
