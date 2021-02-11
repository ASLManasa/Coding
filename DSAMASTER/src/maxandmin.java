import java.util.Arrays;

public class maxandmin
{
    public static void main(String [] args)
    {
        int arr[] =new int[]{1,2,3,6,2};
        int n = arr.length-1;
        Arrays.sort(arr);
        System.out.print("minimum element: ");
        System.out.print(arr[0] +" "+"\n");
        System.out.print("maximum element: ");
        System.out.print(arr[n]);
    }
}
