package Arrays;

public class minimum_swaps {
    public static int min_swaps(int arr[], int k) {
        int min = 0;
        int count = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k)
                count++;
        }
        for (int j = 0; j <= count; j++) {
            if (arr[j] > k)
                result++;
        }


        int i = 0;
        int j = count;

        while (j < count) {
            if (arr[i] > k)
                count--;
            if (arr[j] > k)
                count++;
            result = Math.min(count, result);
            i++;
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 7, 9, 5, 8, 7, 4};
        int k = 5;
        System.out.print(min_swaps(arr, k));

    }
}
