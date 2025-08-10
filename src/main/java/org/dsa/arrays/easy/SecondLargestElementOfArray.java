package org.dsa.arrays.easy;

public class SecondLargestElementOfArray {
    public static void main(String[] args) {
        int[] arr = {32, 53, 53, 53, 43, 3};
        int l = arr[0];
        int sl = Integer.MIN_VALUE;
        for (int i : arr) {
            if(l<i){
                sl = l;
                l = i;
            }else if (i < l && sl < i) {
                sl = i;
            }
        }
        System.out.println(sl);
    }
}
