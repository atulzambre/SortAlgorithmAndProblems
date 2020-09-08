package com.sort.algorithms;
/*
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning.
 The algorithm maintains two subarrays in a given array.

        1) The subarray which is already sorted.
        2) Remaining subarray which is unsorted.

        In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.

*/
public class SelectionSortAlg {
    public static void main(String[] args) {
        int arr[]={3,7,6,1,2,5,4};

        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        
    }
}
