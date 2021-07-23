package SortingSearching;
import java.util.*;

public class pairDifference
{
    public static boolean findPair(int arr[],int n)
    {
        /*sort and then find */
        Arrays.sort(arr);
        int i =0; int j=1;
        while (i < arr.length && j<arr.length)
        {
            if(i != j && arr[j] - arr[i] == n)
            {
                System.out.println(arr[i] +" "+arr[j]);
                return true;
            }
            else if(arr[j] - arr[i] < n)
                j++;
            else
                i++;
        }
        return false;

    }
    public static  void main(String [] args)
    {
        int arr[] = {1, 8, 30, 40, 100};
        int n = 60;
        findPair(arr,n);
    }
}
