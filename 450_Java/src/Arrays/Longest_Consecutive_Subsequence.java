package Arrays;

import java.util.*;

public class Longest_Consecutive_Subsequence {
    public static int longest(int arr[]) {
        int count = 1;
        /* Approach -1 Time Complexity = 0(nlogn)
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i+1]-arr[i] == 1)
                count++;
            else
                break;
        }return count+1 ;*/
        /*Approach -2
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] - arr[j] == 1)
                    count++;

            }
        }
 return count + 1;*/
        /*Appraoch -3 using Hashing o(n)*/
        HashSet<Integer> hash = new HashSet<>();
        for(int i =0;i< arr.length;++i)
        {
            hash.add(arr[i]);
        }
        for(int i =0;i< arr.length;++i)
        {
            if(!hash.contains(arr[i] -1))
            {
                int j = arr[i];
                while (hash.contains(j))
                    j++;

                if(count < j - arr[i])
                    count = j-arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 9, 3, 10, 4, 20, 2};
        System.out.print(longest(arr));
    }
}
