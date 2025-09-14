package org.dsa.binarySearch.medium;

public class ShipPackaging {
    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[]{1,2,3,1,1}, 4));

    }
    public static int getDays(int[] weights, int weightCapacity) {
        int days = 1;
        int weight = 0;
        for(int i : weights) {
            if (weight + i > weightCapacity){
                weight = i;
                days++;
            } else {
                weight += i;
            }
        }
        return days;

    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        int ans = Integer.MAX_VALUE;
        for(int i : weights) {
            high += i;
            low = Math.max(i, low);
        }
        int mid = 0;
        while(low <= high) {
            mid = low + (high - low) / 2;
            int requiredDays = getDays(weights, mid);
            System.out.println(requiredDays);
            if(requiredDays <= days ){
                ans = Math.min(ans , mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
