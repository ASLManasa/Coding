package Arrays;

import java.util.*;

public class sum_triplets {
    public static void count_triplets(int arr[]) {
        int count = 0;
        /*  Brute force using o(n^3)*/
        Arrays.sort(arr);

        // for every element in arr
        // check if a pair exist(in array) whose
        // sum is equal to arr element
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = 0;
            int k = i - 1;
            while (j < k) {
                if (arr[i] == arr[j] + arr[k]) {

                    // pair found
                    System.out.println("numbers are " + arr[i] + " "
                            + arr[j] + " " + arr[k]);

                    return;
                } else if (arr[i] > arr[j] + arr[k])
                    j += 1;
                else
                    k = k - 1;
            }
        }

        System.out.println("no triplet found");

    }

    public static void main(String[] args) {
        int arr[] = {5, 32, 1, 7, 10, 50, 19, 21, 2};
        count_triplets(arr);
    }
}
