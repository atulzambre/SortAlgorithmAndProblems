package com.sort.problems;

import java.util.Arrays;

/*
Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array.
The functions should put all 0s first, then all 1s and all 2s in last.

Examples:

Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

*/
public class SortArrayProblem {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                c0++;
            } else if (arr[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < c0) {
                arr[i] = 0;
            }
            if (i < c0 + c1 && i >= c0) {
                arr[i] = 1;
            }
            if (i < c0 + c1 + c2 && i >= c1 + c0) {
                arr[i] = 2;
            }
        }
    }
}

