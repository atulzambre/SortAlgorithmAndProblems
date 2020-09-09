package com.sort.algorithms;

import java.util.Arrays;

/*
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

        Example:
        First Pass:
        ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
        ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
        ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
        ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

Auxiliary Space: O(1)

Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.

Sorting In Place: Yes

Stable: Yes
*/
public class BubbleSortAlg {

    public static void main(String[] args) {
        int arr[] = {3,2,1};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        bubbleRecursive(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleRecursive(int[] arr, int n) {
        if(n==1)
            return;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleRecursive(arr,n-1);
    }

    private static void bubbleSort(int[] arr) {
        boolean swapped=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }

    }

}
