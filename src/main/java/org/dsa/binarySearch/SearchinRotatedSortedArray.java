package org.dsa.binarySearch;


/*
first find out the sorted part which is sorted and then take decision on the basis of that part
weather to move low or high.
*/
public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int low = 0;
        int n = nums.length - 1;
        int high = n;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
            } else if (nums[mid]==nums[low] && nums[mid]==nums[high]) {
                low = mid + 1;
                high = mid - 1;
            }else if (nums[mid]<=nums[high]) {//right sorted
                if(target >= nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            } else { // left sorted
                if(target < nums[mid] && target >= nums[low])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        System.out.println(-1);
    }
}
