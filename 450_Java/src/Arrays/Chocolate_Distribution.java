package Arrays;

import java.util.Arrays;

public class Chocolate_Distribution {
    public static int diff(int arr[], int M) {
        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + M - 1 < arr.length; i++) {
            int diff = arr[i + M - 1] - arr[i];
            if (diff < ans) {
                ans = diff;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 4, 1, 9, 56, 7, 9, 12};
        int M = 5;
        System.out.print(diff(arr, M));

    }
}
