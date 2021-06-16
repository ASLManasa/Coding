package Arrays;
import java.util.*;
public class Triplets
{
    /*  Brute force approach will be using 3 nested loops - Time complexity:o(n^3)  */
    /*Approach -1 Time complexity : o(n^2)*/


    public static boolean sum(int arr[],int X)
    {
        Arrays.sort(arr);
        for(int i =0;i< arr.length-2;i++) {
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];
                if (sum == X)
                    return true;
                else if (sum > X)
                    end--;
                else if (sum < X)
                    start++;
            }
        }
return false;
    }
    public static void main(String [] args)
    {
        int arr[] = new int[]{ 1, 4, 45, 6, 10, 8 };
        int X = 13;
       // System.out.println(arr.length);
       System.out.print(sum(arr,X));
    }
}
