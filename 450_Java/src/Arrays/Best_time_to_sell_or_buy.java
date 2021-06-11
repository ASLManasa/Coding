package Arrays;

public class Best_time_to_sell_or_buy
{
    public static int max_profit(int arr[])
    {/*    Brute force Approach -1  Time Complexity : o(n^2)
     int maxprofit = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
        */
        /* Approach -2
        Time Complexity  O(n)*/
        int minprice = Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] < minprice)
                minprice = arr[i];
            else if (arr[i] - minprice > maxprofit)

            {
                maxprofit = arr[i]-minprice;
            }
        }
        return maxprofit;
    }
    public static void main(String [] args)
    {
        int arr[] = new int[]{7,1,5,3,6,4};
       System.out.print( max_profit(arr));
    }
}
