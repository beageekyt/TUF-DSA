package org.dsa.arrays.medium;

/*
here we have to certainly need the second array
 */
public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] arr = new int[nums.length];
        int j = 0;
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                arr[k] = nums[i];
                k = k+2;
            } else {
               arr[j] = nums[i];
               j= j+2;
            }
        }
        for (int f : arr){
            System.out.println(f);
        }

    }
}
