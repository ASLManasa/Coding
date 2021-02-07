public class cyclicrotate7
{
    public static void rev(int arr[],int m)
    {
        int x = arr[arr.length-1], i;
        for (i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
        //System.out.print(x);
    }
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4,5,9};
        int m = arr.length;
        rev(arr,m);
        for(int k =0;k<m;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
