package SortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class agrresiveCows {
    public static boolean ispossibe(int arr[], int midDist, int n,int cows) {
        int count = 1;
        int lastCow = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] - lastCow >= midDist) {
                count++;
                lastCow = arr[i];
            }
        }
        if (count >= cows) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cows = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int low = 1;
//        int n = arr.length;
        int high = arr[n - 1] - arr[0];
        int result = 0;
        while (low <= high) {
            int mid = low + high / 2;
            if (ispossibe(arr, mid, n,cows)) {
//                result = mid;
                low = mid + 1;

            } else {
                high = mid - 1;
            }

        }
        System.out.println(high);
        sc.close();
    }
}
