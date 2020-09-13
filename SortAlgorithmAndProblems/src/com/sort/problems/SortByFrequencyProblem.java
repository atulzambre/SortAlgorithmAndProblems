package com.sort.problems;

import java.util.Arrays;

/*

Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

Examples:

Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}

*/
public class SortByFrequencyProblem {
    public static void main(String[] args) {

        int arr[]={2, 5, 2, 8, 5, 6, 8, 8};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
//        int arr2D[][];
//        construct2DArr(arr,arr2D);

    }

    private static void construct2DArr(int[] arr,int[][] arr2D) {
        int check=Integer.MAX_VALUE;
        int count=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

        }
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
