package Arrays;

public class Window_Sliding_Technique
{
    public static void main(String [] args)
    {
        int arr[] = new int[]{1, 4, 2, 10, 2, 3, 1, 0, 20};
        int sum = Integer.MIN_VALUE;
        int k =4;
        int current_sum =0;
       /* Without Sliding Window
       for(int i =0;i < arr.length-k+1;i++)
        {
            int current_sum =0;
            for(int j =0;j< k;j++)
            {
                current_sum = current_sum+arr[i+j];
            }
            sum = Math.max(current_sum,sum);
        }
        System.out.print(sum);*/
        /*With Sliding Window Time Complexity :o(n)*/
        for(int i =0;i<k;i++)
        {
           current_sum += arr[i];
        }
        int window_sum = current_sum;

        for(int i =k;i< arr.length;i++)
        {
            window_sum+=arr[i]-arr[i-k];
            sum = Math.max(sum,window_sum);
        }
        System.out.print(sum);
    }
}
