package org.dsa.arrays.easy;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {9,2,9,5,1,2,2,3,3,4};
        int nonZero = 0 ;
        int temp;
        for (int j = 0;j<nums.length;j++) {
            if(nums[j] != 0){
                temp = nums[nonZero];
                nums[nonZero] = nums[j];
                nums[j] = temp;
                nonZero++;
            }
        }
        System.out.println("non"+nonZero);
        for(int i :nums){
            System.out.println(i);
        }
    }
}
