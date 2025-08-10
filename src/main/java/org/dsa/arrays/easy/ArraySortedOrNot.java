package org.dsa.arrays.easy;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] nums ={1,1,1};
        boolean sorted = true;
        int i = nums[0];
        boolean flag = true;
        for (int j = 1; j < nums.length; j++) {
            if (i <= nums[j]) {
                i = nums[j];
            } else if(i > nums[j] && flag) {
                flag = false;
                i = nums[j];
                System.out.println("false flag");
            } else {
                sorted = false;
                break;
            }
        }
        if(nums[nums.length -1] > nums[0] && flag == false){
            sorted = false;
        }
        System.out.println(sorted);
    }
}
