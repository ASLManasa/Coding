public class subarray020
{
    public static void main(String [] array)
    {
        int A [] = {10,-10};
        int sum =0;
        int ele =0 ;
        //int maxsofar =0;
        for(int i =0;i< A.length;i++)
        {
            //ele = ele + A[i];
            sum = A[i];
            for(int j =i+1;j< A.length;j++)
            {
                if (sum ==0)
                {
                    System.out.print("true");
                }
                sum = sum +A[j];
            }
        }


       // return sum;
    }
}
