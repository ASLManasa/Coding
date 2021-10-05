// reference: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
public class kadanesalgo
{
    public static int maxofsubarray(int a[])
    {
        int maxsofar =0;int maxend =0;
        for(int i =0;i<a.length;i++)
        {
            maxend = maxend +a[i];
            if(maxend <0)
            {
                maxend =0;
            }
            else if(maxsofar <maxend)
            {
                maxsofar=maxend;
            }
        }
        return maxsofar;

    }
    public static  void main(String [] args)
    {
       int a[] ={2, -1, 3, -4, 1, -2, -1, 5, -4};
       // int n = a.length;
        System.out.print("The maximum sum will be :"+maxofsubarray(a));
    }
}
