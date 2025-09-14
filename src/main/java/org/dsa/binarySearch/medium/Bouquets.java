package org.dsa.binarySearch.medium;

import javax.imageio.ImageTranscoder;

public class Bouquets {
    public static void main(String[] args) {
        System.out.println(minDays(new int[]{1,10,3,10,2}, 3, 2));
        System.out.println(minDays(new int[]{1,10,3,10,2}, 3, 1));
    }

    public static int noOfBouquet(int[] bloomDay, int k, int day) {
        int noOfFlowers = 0;
        System.out.println((Math.ceil(1.2)));
        int bouquets = 0;
        double d = 1.4334;
        for(int i : bloomDay) {
            if(i <= day) {
                noOfFlowers++;
            } else {
                noOfFlowers = 0;
            }
            if(noOfFlowers == k){
                noOfFlowers = 0;
                bouquets++;
            }
        }
        return bouquets;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int mid = 0;
        int minDays = -1;
        for(int i : bloomDay){
            min = min > i ? i : min;
            max = max < i ? i : max;
        }
        while ( min <= max ) {
            mid = (min + max) / 2;
            int bouquets = noOfBouquet(bloomDay, k, mid);
            if( bouquets >= m){
                minDays = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }

        }
        return minDays;
    }
}
