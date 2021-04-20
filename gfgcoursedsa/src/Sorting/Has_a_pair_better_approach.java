package Sorting;

import java.util.Arrays;

public class Has_a_pair_better_approach
{
    public static boolean has_a_pair(int arr[], int x)
    {
        Arrays.sort(arr);
       int i =0; int sum =0;
       int j = arr.length-1;
       while(i < arr.length && j >=0)
       {
           sum = arr[i] +arr[j];
           if (sum == x)
           return true;
           else if(sum > x)
               j--;
           else
               i++;

       }

        return false;
    }
    public static void main(String [] args) {


        int arr[] = new int[]{1, 4, 45, 6, 10, -8};
        int x = 16;
        Boolean b = has_a_pair(arr, x);
        System.out.println(b);
    }
}
