package Arrays;
import java.util.*;

public class Kth_minimum
{
    public static int min(int arr[] ,int k)
    {// Approach -1
        Arrays.sort(arr);
        int value = arr[k-1];
        return value;

    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{7,10,4,3,20,15};
        int k = 3;
        System.out.println(min(arr,k));
    }
}
