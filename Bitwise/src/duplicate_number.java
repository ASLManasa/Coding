public class duplicate_number
{
    public static void dupli(int arr[])
    {
        int xor =0;
        for(int i =1;i< arr.length;i++)
        {
            xor = xor^i;
           // System.out.println(xor);
            if(xor ==0)
                System.out.println(arr[i]);

        }
    }
    public static void main(String [] args)
    {
        int arr[] = {1,2,3,4,3,2,1};
        dupli(arr);
    }
}
