package org.dsa.binarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {5};
        int target = 5;
        int start = 0;
        int end = nums.length-1;
        int mid = end/2;
        while(start<=end){
            if(target == nums[mid]){
                System.out.println("ans =" +  mid);
                return;
            }
            else if(target > nums[mid])
                start = mid+1;
            else
                end = mid-1;
            mid = start + (end - start)/2;
        }
        System.out.println(-1);
    }
}
