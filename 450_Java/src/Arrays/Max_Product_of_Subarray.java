package Arrays;

import java.util.Arrays;

public class Max_Product_of_Subarray {
    public static int product(int arr[]) {
        int max_val = arr[0];
        int min_val = arr[0];
        int max_product = arr[0];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp = max_val;
                max_val = min_val;
                min_val = temp;
            }
            max_val = Math.max(arr[i], max_val * arr[i]);
            min_val = Math.min(arr[i], min_val * arr[i]);
            max_product = Math.max(max_product, max_val);
        }

        return max_product;

    }


    public static void main(String[] args) {
        int arr[] = new int[]{8, -2, -2, 0, 8, 0, -6, -8, -6, -1};
        System.out.println(product(arr));
        // product(arr);
    }
}
