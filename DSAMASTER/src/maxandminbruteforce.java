public class maxandminbruteforce
{
    public static void main(String [] args)
    {
        int arr [] = new int[] {5,7,1,4,8};
        int max = arr[0];
        int min = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(max < arr[i])
                max = arr[i];
        }
        System.out.print("maximum value will be: "+ max+"\n");
        for(int i =0;i<arr.length;i++)
        {
            if(min > arr[i])
                min = arr[i];
        }
        System.out.print("minimum value will be: "+min);
    }
}
