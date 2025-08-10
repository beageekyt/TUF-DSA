package org.dsa.arrays.easy;

public class FindUnionOfSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6, 9};
        int[] arr2 = {1, 2,3, 4, 6, 9, 17};
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] unionArr = new int[arr1Length + arr2Length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1Length && j < arr2Length) {
            if (arr1[i]==arr2[j]) {
                unionArr[k] = arr1[i];
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                unionArr[k] = arr1[i];
                k++;
                i++;
            } else {
                unionArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1Length) {
            unionArr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2Length) {
            unionArr[k] = arr2[j];
            k++;
            j++;
        }
        for (int l=0 ; l<k;l++)
            System.out.print(unionArr[l] + " ");
    }


}
