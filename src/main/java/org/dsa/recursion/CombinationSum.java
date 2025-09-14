package org.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> getCombination(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> ans, int sum) {
        if (sum==target) {
            ans.add(new ArrayList<>(current));
            return ans;
        } else if (sum > target || index >= candidates.length) {
            return ans;
        }
        current.add(candidates[index]);
        getCombination(candidates, target, index, current, ans, sum + candidates[index]);
        current.remove(current.size() - 1);
        getCombination(candidates, target, index + 1, current, ans, sum);
        return ans;
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return getCombination(candidates, target, 0, new ArrayList<>(), new ArrayList<>(), 0);

    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        System.out.println(Arrays.toString(Arrays.stream(combinationSum(nums, target).toArray()).toArray()));

    }
}
