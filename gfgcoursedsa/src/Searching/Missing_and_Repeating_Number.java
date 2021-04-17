package Searching;
import java.util.*;

public class Missing_and_Repeating_Number
{
    public static void main(String [] args)
    {
        int arr [] = new int []{2, 3, 2, 1, 5};
        int n = arr.length;
        Arrays.sort(arr);
        int rep =0;
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i] == arr[i+1])
            {
                rep = arr[i];
                System.out.println("The repeating number is :" +rep);

            }

        }
        int sum = n*(n+1)/2;
        int sum_arr =0;
        for(int i =0;i<arr.length;i++)
        {
            sum_arr =sum_arr + arr[i];
        }
       /* System.out.println(sum);
        System.out.println(sum_arr);*/
        int req_number = sum - sum_arr +rep;
        System.out.println("The missing number is:" + req_number);

    }
}
