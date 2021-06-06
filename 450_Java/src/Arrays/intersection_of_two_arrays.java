package Arrays;

import java.util.HashSet;

public class intersection_of_two_arrays {
    public static void intersection(int[] arr1, int arr2[]) {

       /* int m = arr1.length;
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
        }*/
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2, 4, 5, 6};
        int arr2[] = new int[]{2, 3, 5, 7};
        intersection(arr1, arr2);
    }
}
