package org.dsa.arrays.easy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,0,1,0};
        int consicutive = 0;
        int maxConsicutive = 0;
        for(int i : nums ){
            if(i == 1) {
                consicutive++;
            } else {
                if(consicutive > maxConsicutive)
                    maxConsicutive = consicutive;
                consicutive = 0;
            }


        }
        System.out.println(Math.max(maxConsicutive, consicutive));
    }
}
