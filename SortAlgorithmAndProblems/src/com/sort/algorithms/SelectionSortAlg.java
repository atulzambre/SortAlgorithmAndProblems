package com.sort.algorithms;

import java.util.Arrays;

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
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        for (int i=0;i<arr.length;i++){
          int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        
    }
}
