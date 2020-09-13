package com.sort.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a subset of arr1[] or not.
Both the arrays are not in sorted order. It may be assumed that elements in both array are distinct.

Examples:

Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1}
Output: arr2[] is a subset of arr1[]

Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4}
Output: arr2[] is a subset of arr1[]

Input: arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3}
Output: arr2[] is not a subset of arr1[]
*/
public class FindSubarrayProblem {
    public static void main(String[] args) {
        int arr1[]={11, 1, 13, 21, 3, 7};
        int arr2[]={11, 3, 7, 1};
        mergeSort(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr1));
        boolean flag=true;
        //sort and search solution
        for (int i=0;i<arr2.length;i++){
            if(!binarySearch(arr1,0,arr1.length-1,arr2[i])){
              flag=false;
            }
        }

        //hashset solution
//        flag=hashSetSolution(arr1,arr2);
        if(!flag)
            System.out.println("Not a Subarray");
        else
            System.out.println("it is a subarray");
    }



    private static boolean binarySearch(int[] arr1, int l, int r, int key) {
       if(l<=r){
           int mid=l+(r-l)/2;
           if(arr1[mid]==key)
               return true;
           if(arr1[mid]>key)
               return binarySearch(arr1,l,mid-1,key);
           else
               return binarySearch(arr1,mid+1,r,key);
       }
        return false;
    }

    private static void mergeSort(int[] arr1, int l, int r) {
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr1,l,mid);
            mergeSort(arr1,mid+1,r);
            sort(arr1,l,mid,r);

        }

    }

    private static void sort(int[] arr1, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;

        int l1[]=new int[n1];
        int r1[]=new int[n2];
        for (int i=0;i<n1;i++)
            l1[i]=arr1[l+i];

        for (int i=0;i<n2;i++)
            r1[i]=arr1[mid+1+i];

        int i=0,j=0;
        int count=l;

        while (i<n1&&j<n2){
            if(l1[i]>r1[j]){
                arr1[count]=r1[j];
                j++;
            }
            else{
                arr1[count]=l1[i];
                i++;
            }
            count++;
        }


        while (i<n1){
            arr1[count]=l1[i];
            i++;
            count++;
        }
        while (j<n2){
            arr1[count]=r1[j];
            j++;
            count++;
        }

    }


    //hash set solution

    private static boolean hashSetSolution(int[] arr1, int[] arr2) {
        Set<Integer> hashSet=new HashSet<>();
        boolean flag=true;
        for (int i=0;i<arr1.length;i++)
            hashSet.add(arr1[i]);

       for (int i=0;i<arr2.length;i++){
           if(!hashSet.contains(arr2[i]))
               flag=false;
        }

       return flag;
    }
}
