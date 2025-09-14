package org.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int size = nums.length;
        return getSubsets(size, nums, list, new ArrayList<>(), 0);
    }

    public static List<List<Integer>> getSubsets(int size, int[] nums, List<List<Integer>> list, List<Integer> intermidiateList, int current) {
        if (current==size) {
            list.add(intermidiateList);
            return list;
        }
        List<Integer> newList = new ArrayList<>(intermidiateList);
        getSubsets(size, nums, list, newList, current + 1);
        List<Integer> newList2 = new ArrayList<>(intermidiateList);
        newList2.add(nums[current]);
        getSubsets(size, nums, list, newList2, current + 1);
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = subsets(nums);
        list.add(new ArrayList<>());
    }
}
