package org.dsa.arrays.easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int sum = 0;
        for(int i : nums) {
            sum = sum + i;
        }
        int sumOfAp = ((nums.length + 1) * (nums.length))/2;
        System.out.println(sumOfAp - sum);
    }
}
