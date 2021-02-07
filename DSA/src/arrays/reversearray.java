package arrays;

import java.util.Scanner;

public class reversearray
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr []=new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before ");
        for(int k =0;k<arr.length;k++)
        {

            System.out.print(arr[k]+" ");
        }
        System.out.print(" \n");
        System.out.println("after reversing");

        for(int h = n-1;h >=0;h--)
        {
            System.out.print(arr[h]+" ");
        }

    }
}
