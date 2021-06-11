package Arrays;

import java.util.Arrays;

public class inversion_Count {
    /*Approach 1
        int count =0;
       for(int i=0;i<arr.length;i++)
       {
           for(int j =i+1;j<arr.length;j++)
           {
               if(arr[i]> arr[j])
               {
                   count++;
               }
           }
       }

 return count;*/
/*tIME COmplexity : o(nlogn)*/
        public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

        private static int mergeAndCount(int[] arr, int l, int m, int r) {

        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            //if the left element is sorted then no inversion
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            //if not then swap and the select the elements
            else {
                arr[k++] = right[j++];
//				swaps += (m + 1) - (l + i);
                swaps += left.length - i;
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }

        // Merge sort function
        private static int mergeSortAndCount(int[] arr, int l, int r) {

        int count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            count += mergeSortAndCount(arr, l, m);

            count += mergeSortAndCount(arr, m + 1, r);

            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }
    public static void main(String [] args)
    {
        int arr[] = new int[]{8, 4, 2, 1};
       System.out.print( mergeSortAndCount(arr,0,arr.length-1));
    }
}
