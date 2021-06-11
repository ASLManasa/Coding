package Arrays;

import java.util.Arrays;

public class Count_Pairs
{
    public static int count_num(int arr[] ,int k)
    {/*Approach -1 Brute force Time complexity -O(n^2)*/
        int count =0;

        for(int i =0;i<arr.length;i++)
        {
            for (int j =i+1;j< arr.length;j++)
            {
                if(arr[i] +arr[j] == k)
                {
                    count++;
                }
            }
        }
        /* Approach -2 but doesnt count all the possible cases.
        int count =0;
        Arrays.sort(arr);
        for(int m :arr)
            System.out.println(m + " ");
        int i =0;
        int j = arr.length-1;
        while (i< arr.length && j >=0)
        {
            if(arr[i] +arr[j] > k)
                j--;
            else if (arr[i] +arr[j] < k)
                i++;
            else {
                count++;
                i++;
                j--;
            }
        }*/
        return count;
    }
    public static void main(String [] args)
    {
        int k = 2;
        int arr[] = new int[]{1, 1, 1, 1};
        System.out.println(count_num(arr,k));
    }
}
