package org.dsa.arrays.easy;

public class LargestElementOfArray {
    public static void main(String[] args) {
        int[] arr = {34, 53, 432, 2323, 4343, 3};
        int largest = arr[0];
        for (int i : arr) {
            if (largest < i)
                largest = i;
        }
        System.out.println(largest);
    }
}
