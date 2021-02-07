package arrays;

import java.util.Scanner;
import java.util.*;

public class minmaax
{
    public static void main(String [] args)

    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int j =0;j< arr.length;j++)
        {
          System.out.print(arr[j]+" ");
        }
        System.out.print(" \n");
        System.out.print(arr[0]);
        System.out.print("\n");
        System.out.print(arr[n-1]);
    }
}
