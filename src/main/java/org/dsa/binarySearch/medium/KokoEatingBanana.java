package org.dsa.binarySearch.medium;

public class KokoEatingBanana {
    public static long hoursRequired ( int[] piles, int banansInAnHour){
        long totalHours = 0;
        for (int pile : piles) {
            int hoursRequiredToEatOnePile = pile / banansInAnHour;
            totalHours += hoursRequiredToEatOnePile;
            if (pile % banansInAnHour!=0)
                totalHours++;
        }
        return totalHours;
    }
    public static int minEatingSpeed(int[] piles, int h){
        int low = 1;
        int high = Integer.MIN_VALUE;
        int mid = 0;
        int minimumHours = 0;
        for (int i : piles) {
            high = i > high ? i:high;
        }
        while (low <= high) {
            mid = low + (high - low) / 2;
            long hours = hoursRequired(piles, mid);
            if(mid == 1) {
                System.out.println(hours);
            }
            if (hours <= h) {
                System.out.println(mid);
                high = mid - 1;
                minimumHours = mid;
            } else {
                low = mid + 1;
            }
        }
        return minimumHours;

    }
    public static void main(String[] args) {
        int[]piles = {805306368,805306368,805306368};
        int h = 1000000000;
        System.out.println(minEatingSpeed(piles, h));
    }
}
