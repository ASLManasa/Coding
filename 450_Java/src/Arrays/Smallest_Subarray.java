package Arrays;

public class Smallest_Subarray {
    public static int min_subarray(int arr[], int x) {
        /*Brute Force */
        int min_length = arr.length + 1;
        int current_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return 1;
            for (int j = i + 1; j < arr.length; j++) {
                current_sum += arr[j];
                if (current_sum > x && j - i + 1 < min_length)
                    min_length = j - i + i;

            }
        }


        return min_length;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 10, 5, 2, 7};
        int x = 9;
      System.out.print(min_subarray(arr1, x));
    }
}
