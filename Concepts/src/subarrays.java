public class subarrays
{
    public static void main(String[] args)
    {
        //intializing the array
        int arr [] = new int []{1,2,3,4};

        //selecting the starting point
        System.out.println("These are the subarrays of the arr");
        for(int i =0 ;i< arr.length;i++)
        {
            //selecting the end point
            for(int j  = i;j< arr.length;j++)
            {
                //we will print the values between starting and ending point
                for(int k =i ;k<=j ;k++)
                {
                    //System.out.println("These are the subarrays of the arr");
                   // System.out.print(arr[k]+" ");
                    System.out.print(arr[k]+" ");
                }
                System.out.println(" ");
            }
        }

    }
}
