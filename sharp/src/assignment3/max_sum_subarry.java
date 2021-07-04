package assignment3;

public class max_sum_subarry
{
    public static void main(String [] args)
    {
        int arr[] ={1,-1,1,2,3};
        int max_value= Integer.MIN_VALUE;
        int max_end =0;
        for(int i =0;i<arr.length;i++)
        {
            max_end = max_end+arr[i];
            if(max_value< max_end)
                max_value=max_end;
            if(max_end==0)
                max_end=0;
        }
        System.out.println(max_value);
    }
}
