package Sorting;

import java.util.Arrays;

public class Has_a_Pair {
    public static boolean has_a_pair(int arr[], int x) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == x)
                    return true;
            }

        }


        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 2, 1, 9};
        int x = 100;
        Boolean b = has_a_pair(arr, x);
        System.out.println(b);
    }
}
