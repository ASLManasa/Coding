package Sorting;

import java.util.Arrays;

public class Two_arrays_are_equal
{
    public static boolean equal(int arr[],int arr2[])
    {
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(arr.length != arr2.length)
            return false;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] != arr2[i])
                return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
        int arr[] = new int[]{4,5,1,6,2,8};
        int arr2 [] = new int[]{2,6,1,4,5};
        Boolean b = equal(arr,arr2);
        System.out.println(b);
    }
}
