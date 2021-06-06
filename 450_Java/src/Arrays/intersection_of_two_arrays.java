package Arrays;

import java.util.HashSet;

public class intersection_of_two_arrays {
    public static void intersection(int[] arr1, int arr2[]) {

       /* Approach -1   brute force */
        int m = arr1.length;
        int n = arr2.length;
        int i = 0;
        int j = 0;
        while(i <m &&  j < n)
        {
            if(arr1[i] <arr2[j])
                i++;
            else if (arr2[j] <arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] +" ");
                i++;
            }
        }
       /* Approach -2 : Using Hashset
       HashSet <Integer> intersection = new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            intersection.add(arr1[i]);
        }
        for(int j =0;j< arr2.length ;j++)
        {
            if(intersection.contains(arr2[j]))
            {
                System.out.print(arr2[j] +" ");
            }
        }*/
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2, 4, 5, 6};
        int arr2[] = new int[]{2, 3, 5, 7};
        intersection(arr1, arr2);
    }
}
