package org.dsa.arrays.medium;


/*
here we will try to find out the minimum buying point and then while traversing to the stocks
we will check at what point 
 */
public class BestTimeToBuyandSellStock {
    public static void main(String[] args) {
        int[] nums = {7, 6, 5, 4};
        int maxProfit = 0;
        int profit = 0;
        int buy = nums[0];
        for (int i = 0; i < nums.length; i++) {
            profit = nums[i] - buy;
            maxProfit = Math.max(profit, maxProfit);
            if(profit < 0) {
                buy = nums[i];
            }
        }
        System.out.println(maxProfit);
    }
}
