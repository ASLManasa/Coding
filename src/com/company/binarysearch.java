package com.company;

import java.util.Scanner;

public class binarysearch
{
    public static int bsearch(int[] arr,int x, int f, int l)
    {
        if (l>=f){
            int mid = f + (l - f)/2;
            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] > x){
                return bsearch(arr, f, mid-1, x);//search in left subarray
            }else{
                return bsearch(arr, mid+1, l, x);//search in right subarray
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int f = 0;
        int arr[] = new int[n];
        int l = arr.length-1;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
         int result = bsearch(arr,x,f,l);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}

