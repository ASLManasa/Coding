package assignment3;

import java.util.Arrays;

public class max_in_an_array {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 2, 4};
        int n = arr.length;
        /* Approach -1
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        */
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
