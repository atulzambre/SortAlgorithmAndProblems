package com.sort.problems;
/*
 Given two arrays X[] and Y[] of positive integers, find number of pairs such that x^y > y^x where x is an element from X[] and y is an element from Y[].

Examples:

Input: X[] = {2, 1, 6}, Y = {1, 5}
Output: 3
Explanation: There are total 3 pairs where pow(x, y) is greater
than pow(y, x) Pairs are (2, 1), (2, 5) and (6, 1)

Input: X[] = {10, 19, 18}, Y[] = {11, 15, 9}
Output: 2
Explanation: There are total 2 pairs where pow(x, y) is greater
than pow(y, x) Pairs are (10, 11) and (10, 15)
 */

public class PairPowerProblem {
    public static void main(String[] args) {
        int arr1[]={2, 1, 6};
        int arr2[]={1, 5};
        pairPower(arr1,arr2);

    }

    private static void pairPower(int[] arr1, int[] arr2) {
        int count=0;
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(Math.pow(arr1[i],arr2[j])>Math.pow(arr2[j],arr1[i])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
