import java.util.Arrays;

public class consecmax
{
    public static int cons(int [] arr)
    {
        Arrays.sort(arr);
        int count = 0;
       int val;
        for(int i =0;i < arr.length;i++)
        {
            val = arr[0]+i;
            for(int k = 0;k < arr.length;k++)
            {
                if(arr[k] ==val )
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String [] args)
    {
        int arr [] ={36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
        //Arrays.sort(arr);
       /* for(int k =0;k< arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }*/
        System.out.print(cons(arr));


    }
}
