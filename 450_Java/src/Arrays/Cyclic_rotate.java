package Arrays;

public class Cyclic_rotate
{
    public static void rev(int arr[])
    {
        /* Approach -1 Brute force
        int rev []=new int[arr.length];
        rev [0] = arr[arr.length-1];
        //System.out.println(rev[0]);
        for(int i =0;i< arr.length-1;i++)
        {
            rev[i+1] = arr[i];
        }*/
        /*approach -2*/
        int x = arr[arr.length-1];
        for(int i = arr.length-1;i >0 ;i--)
        {
            arr[i] = arr[i-1];

        }
        arr[0] = x;
        for(int c : arr)
        {
            System.out.print(c +" ");
        }

    }
    public static void main(String [] args)
    {
        int arr[]= new int[]{1,2,3,4,5};
        rev(arr);
    }
}
