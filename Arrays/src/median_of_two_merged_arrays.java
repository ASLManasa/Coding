import java.util.*;
public class median_of_two_merged_arrays
{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int arr [] = new int[nums1.length + nums2.length];
        int count =0;
        for (int i =0;i<nums1.length;i++)
        {
            arr[i] = nums1[i];
            count++;
        }
        for(int j = 0; j < nums2.length;j++) {
            arr[count++] = nums2[j];
        }
        Arrays.sort(arr);
        double ans=0;
        int n = arr.length;
        if(arr.length%2==0)
        {
            ans = (arr[(n-1)/2] + arr[n/2])/2.0;
        }
        else
        {
            ans = (arr[n/2]);
        }
        return ans;

    }
    public static void main(String[] args)
    {
        int [] nums1 = new int[]{1,3};
        int []nums2 = new int[]{2};
        System.out.print(findMedianSortedArrays(nums1,nums2));

    }
}
