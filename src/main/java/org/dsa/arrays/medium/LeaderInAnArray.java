package org.dsa.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        int n = nums.length;
        int largest = nums[n - 1];
        ArrayList<Integer> a = new ArrayList<>();
        a.add(nums[n-1]);
        for (int i = n-1; i >= 0; i--) {
            if(nums[i]> largest) {
                largest = nums[i];
                a.add(nums[i]);
            }
        }
        a.forEach(System.out::println);

    }
}
