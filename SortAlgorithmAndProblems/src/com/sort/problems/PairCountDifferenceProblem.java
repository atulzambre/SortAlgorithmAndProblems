package com.sort.problems;

import java.util.Arrays;

/*
Given an integer array and a positive integer k, count all distinct pairs with difference equal to k.

Examples:

Input: arr[] = {1, 5, 3, 4, 2}, k = 3
Output: 2
There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2}

Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
Output: 5
There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8},
{8, 12}, {12, 16} and {16, 20}
*/
public class PairCountDifferenceProblem {
    public static void main(String[] args) {
        int arr[]={1, 5, 3, 4, 2};

        mergeSortSolution(arr,0,arr.length-1,3);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortSolution(int[] arr, int l, int r, int key) {
        if(l<r){
            int mid=(r+l)/2;
            mergeSortSolution(arr,l,mid,key);
            mergeSortSolution(arr,mid+1,r,key);
            findDifference(arr,l,mid,r,key);
        }

    }

    private static void findDifference(int[] arr, int l, int mid, int r, int key) {
        int n1=mid-l+1;
        int n2=r-mid;

        int l1[]=new int[n1];
        int r1[]=new int[n2];
        for (int i = 0; i < n1; ++i)
            l1[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            r1[j] = arr[mid + 1 + j];



        int i=0,j=0;
        int count=l;

        while(i<n1&&j<n2){

            if(l1[i]>=r1[j]){
                arr[count]=r1[j];
                j++;
            }
            else{
                arr[count]=l1[i];
                i++;
            }
            count++;
        }
        while(i<n1){
            arr[count]=l1[i];
            count++;
            i++;
        }
        while(j<n2){
            arr[count]=r1[j];
            count++;
            j++;
        }

    }
}
