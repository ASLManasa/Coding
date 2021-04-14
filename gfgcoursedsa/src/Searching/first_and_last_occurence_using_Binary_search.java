package Searching;
/* O(logn) is time cmplexity hence better*/
public class first_and_last_occurence_using_Binary_search
{
    public static int first_occurence(int arr[],int x,int n)
    {
        int low =0; int high = n-1; int ans =-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
                high = mid-1;
            else if (arr[mid] < x)
                low = mid+1;
            else
            {
                ans = mid;
                high = mid-1;
            }

        }
        return ans;
    }
    public static int last_occurence(int arr[],int x,int n)
    {int low =0; int high = n-1; int ans =-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] > x)
                high = mid-1;
            else if (arr[mid] < x)
                low = mid+1;
            else
            {
                ans = mid;
                low = mid+1;
            }

        }
        return ans;


    }
    public static void main (String [] args)
    {
        int arr[] = {1, 2, 2, 2, 2,3, 4, 7, 8, 8};
        int x = 8;
        int n = arr.length;
        System.out.println("First occurence:");
      System.out.println(first_occurence(arr,x,n));
        System.out.println("last occurence:");
       System.out.println( last_occurence(arr,x,n));


    }
}
