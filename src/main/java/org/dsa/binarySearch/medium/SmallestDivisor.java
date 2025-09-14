package org.dsa.binarySearch.medium;

public class SmallestDivisor {
    public static int getSum(int[] nums, double divisor){
        int sum = 0;

        for(double i : nums){
            if(divisor == 3){
                System.out.println(i/divisor);
                System.out.println((int) Math.ceil(i/divisor));
            }
            sum = sum + (int) Math.ceil(i/divisor);
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i :nums){
            high = Math.max(i, high);
        }
        int smallestDivisor = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high - low)/2;
            int sum = getSum(nums, mid);
            if(mid == 3) {
                System.out.println(sum);
            }
            if(sum <= threshold) {
                smallestDivisor = Math.min(smallestDivisor, mid);
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return smallestDivisor;
    }

    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{1,2,5,9}, 6));
//        System.out.println(smallestDivisor(new int[]{1,10,3,10,2}, 3));
    }
}
