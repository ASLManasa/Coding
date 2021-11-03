package Arrys;

import java.util.*;

//time complexity : O(nlogn)

public class kthmax_min {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 5, 4};
        int l = 0;
        int r = arr.length;
        int k = 2;
        System.out.println(kthSmallest(arr, l, r, k));
    }
}
