package org.dsa.binarySearch;

import java.util.Arrays;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,4,6,7,3,2,4,2,1};
        int low = 1;
        int n = nums.length;
        int high = n - 2;
        int mid = 0;
        if( n == 1 )
            System.out.println(0);
        if(nums[0]>nums[1])
            System.out.println(0);
        else if(nums[n-1]>nums[n-2])
            System.out.println(n-1);;
        while (low <= high) {
            mid = (low + high) / 2;
            if(nums[mid] > nums[mid-1] && nums[mid]> nums[mid+1]){
                System.out.println(mid);
            } else if( nums[mid] > nums[mid - 1] && nums[mid + 1] > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println(mid);
    }
}
