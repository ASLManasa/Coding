package com.company;

import java.util.Scanner;

public class linearsearch
{
    public static void lsearch(int arr[],int n,int x){
        for(int k =0;k<arr.length;k++)
        {
            if (arr[k] == x)
            {
                System.out.println(k+1+" : "+"the value of x");
            }
        }

    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        lsearch(arr,n,x);
    }
}

