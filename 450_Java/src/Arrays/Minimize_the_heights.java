package Arrays;

import java.util.Arrays;

public class Minimize_the_heights
{
    public static int min_height(int arr[] ,int k) {
        Arrays.sort(arr);
        int max_height = arr[arr.length - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[arr.length - 1] - k;
        int minimum =0;
        int maximum =0;
        for (int i = 0; i < arr.length-1; i++)
        {
            minimum = Math.min(smallest,arr[i+1]-k);
            maximum = Math.max(largest,arr[i]-k);
            if( minimum <0) continue;
            max_height = Math.min(max_height,maximum-minimum);
        }
        return max_height;
    }
    public static void main(String [] args)
{
     int arr [] = new int[]{1, 5, 8, 10};
     int k =2;
    System.out.println(min_height(arr,k));

}
}
