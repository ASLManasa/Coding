/* o(n^2) - time compexity*/
package Sorting;

public class selection_sort {
    public static void selection(int arr[])
    {
        int min_index;
        for(int i =0 ;i<arr.length;i++)
        {
            min_index = i;
            for(int j =i+1 ;j<arr.length;j++ )
            {
                if(arr[j] < arr[min_index])
                    min_index = j;
            }
            int temp = arr[i];
             arr[i] = arr[min_index] ;
             arr[min_index]= temp;
        }
    }
    public static void main(String [] args) {
        int arr[] = new int[]{12, 11, 13, 5, 6};
       selection(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
