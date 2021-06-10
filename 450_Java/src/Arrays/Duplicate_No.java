package Arrays;

import java.util.Arrays;
import java.util.*;

public class Duplicate_No {
    public static int dupli(int arr[],int range)
    {
        /*Approach -1 o(nlogn)
        Arrays.sort(arr);
        int ans = 0;
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i] == arr[i+1])
                ans = arr[i];
        }*/
        /*Approach -2
        int ans =0;
        for(int i =0;i< arr.length;i++)
        {
            for (int j =1;j< arr.length;j++)
            {
                if(arr[i] == arr[j])
                    ans = arr[i];
            }
        }*/
       /* int sum = 0;
        for(int i =0 ;i< arr.length;i++)
        {
            sum +=arr[i];
        }
        int ans=0;
        int val = range+1;
        int sum1 = val*(val+1)/2;
        ans = sum-sum1;

        return ans;*/
        /*Approach -4 O(n)*/
        Set<Integer> seen = new HashSet<Integer> ();
        for(int num :arr)
        {
            if(seen.contains(num))
            {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
    public static void main(String [] args)
    {
        int arr[] = new int[]{1,3,4,2,2};
        int start =1;
        int n = 4;
        int range = n-start;
        System.out.println(dupli(arr,range));
    }
}
