public class Key_in_Segment
{
    public static boolean search(int arr[],int x,int k)
    {
        int i;
        for (i = 0; i < arr.length; i = i + k) {
            // Search X in segment starting
            // from index i.
            int j;
            for (j = 0; j < k; j++)
                if (arr[i + j] == x)
                    break;
            // If loop didn't break
            if (j == k)
                return false;
        }
        // If arr length is a multiple of K
        if (i == arr.length)
            return true;
        // Check in last segment if N
        // is not multiple of K.
        int j;
        for (j=i-k; j<arr.length; j++)
            if (arr[j] == x)
                break;
        if (j == arr.length)
            return false;
        return true;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{ 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
        int x=3;
        int k=3;
      System.out.print( search(arr,x,k) );
    }
}
