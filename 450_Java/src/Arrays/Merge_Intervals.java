package Arrays;
import java.util.*;
import java.util.ArrayList;

public class Merge_Intervals
{
    public static int[][] interval(int arr[][])
    {
        List <int []> inter = new ArrayList<>();
        Arrays.sort(arr,(arr1,arr2) -> Integer.compare(arr1[0],arr1[0]));
        if(arr.length == 0|| arr == null)
            return inter.toArray(new int[0][]);
        int start = arr[0][0];
        int end = arr[0][1];
        for(int[] i : arr)
        {
            if(i[0] <= end)
                end=Math.max(end,i[1]);
            else {
                inter.add(new int[]{start,end});
                        start = i[0];
                end= i[1];
            }
        }
        inter.add(new int[]{start, end});
        return inter.toArray(new int[0][]);
    }
    public static void main(String [] args)
    {
        int [][] arr = new int[][]{{1,3},{2,6}, {8, 10},{15,18}};
        interval(arr);
    }
}
