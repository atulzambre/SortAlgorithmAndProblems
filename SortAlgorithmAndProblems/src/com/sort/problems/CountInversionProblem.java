package com.sort.problems;

import java.util.Arrays;

/*

Inversion Count for an array indicates – how far (or close) the array is from being sorted.
If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

Example:

Input: arr[] = {8, 4, 2, 1}
Output: 6

Explanation: Given array has six inversions:
(8,4), (4,2),(8,2), (8,1), (4,1), (2,1).


Input: arr[] = {3, 1, 2}
Output: 2

Explanation: Given array has two inversions:
(3, 1), (3, 2)

*/
public class CountInversionProblem {
    public static void main(String[] args) {
        int arr[]={ 1, 20, 6, 4, 5 };
        int inversions=merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println("Inversions are :"+inversions);
    }

    private static int merge(int[] arr, int l, int r) {
        int count=0;
        if(r>l){
            int mid=(r+l)/2;
            count+=merge(arr,l,mid);
            count+=merge(arr,mid+1,r);
            count+=countInversion(arr,l,mid,r);

        }
        return count;
    }

    private static int countInversion(int[] arr, int l, int mid, int r) {
        int inversions=0;
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[l+i];

        for(int i=0;i<n2;i++)
            right[i]=arr[mid+1+i];
        int i=0,j=0;
        int count=l;
        while (i<n1&&j<n2){
            if(left[i]>=right[j]){
                arr[count]=right[j];
                inversions+=(mid+1)-(l+i);
                j++;
            }
            else{
                arr[count]=left[i];
                i++;
            }
            count++;
        }

        while(i<n1){
            arr[count]=left[i];
            i++;
            count++;
        }
        while(j<n2){
            arr[count]=right[j];
            j++;
            count++;
        }

    return inversions;

    }
}
