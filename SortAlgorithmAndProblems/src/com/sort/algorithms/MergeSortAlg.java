package com.sort.algorithms;
/*
Like QuickSort, Merge Sort is a Divide and Conquer algorithm. It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves. The merge() function is used for merging two halves. The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. See following C implementation for details.

        MergeSort(arr[], l,  r)
        If r > l
        1. Find the middle point to divide the array into two halves:
        middle m = (l+r)/2
        2. Call mergeSort for first half:
        Call mergeSort(arr, l, m)
        3. Call mergeSort for second half:
        Call mergeSort(arr, m+1, r)
        4. Merge the two halves sorted in step 2 and 3:
        Call merge(arr, l, m, r)
        The following diagram from wikipedia shows the complete merge sort process for an example array {38, 27, 43, 3, 9, 82, 10}. If we take a closer look at the diagram, we can see that the array is recursively divided in two halves till the size becomes 1. Once the size becomes 1, the merge processes comes into action and starts merging arrays back till the complete array is merged.
*/
public class MergeSortAlg {
    public static void main(String[] args) {
        int arr[]={2,1};
        mergeSort(arr,0,arr.length-1);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            merge(arr,l,mid,r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {

    }
}
