package com.sort.problems;

/*
Given an unsorted array arr[0..n-1] of size n, find the minimum length subarray arr[s..e]
such that sorting this subarray makes the whole array sorted.

Examples:
1) If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60],
your program should be able to find that the subarray lies between the indexes 3 and 8.

2) If the input array is [0, 1, 15, 25, 6, 7, 30, 40, 50],
your program should be able to find that the subarray lies between the indexes 2 and 5.

*/
public class UnsortedSubarrayProblem {
    public static void main(String[] args) {
        int arr[] = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        printSubarrayIndex(arr);
    }

    private static void printSubarrayIndex(int[] arr) {

        int s = -1, e = -1;
        int min = -1, max = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                s = i - 1;
                break;
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] > arr[i]) {
                e = i;
                break;
            }
        }
        int i = s, j = e;
        while (i < j) {
            if (arr[i] > arr[j]) {
                max = arr[i];
                j--;
            } else {
                max = arr[j];
                i++;
            }
        }
        i = s;
        j = e;
        while (i < j) {
            if (arr[i] < arr[j]) {
                min = arr[i];
                j--;
            } else {
                min = arr[j];
                i++;
            }
        }
        for (int k = 0; k < s; k++) {
            if (arr[k] > min) {
                s = k;
            }
        }
        for (int k = e; k < arr.length; k++) {
            if (arr[k] < max) {
                e = k;
            }
        }

        System.out.println(min + "," + max);
        System.out.println(s + " , " + e);
    }
}
