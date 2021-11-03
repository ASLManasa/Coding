package Arrys;
// Time complexity : O(n)
public class neg_pos {
    public static void sort(int arr[], int n) {
        int left = 0;

        int right = arr.length - 1;
        int temp = 0;
        while (left <= right) {
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            } else if (arr[left] > 0 && arr[right] < 0) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else {
                left++;
                right--;
            }


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5,
                6, -7, 5, -3, 11};

        int arr_size = arr.length;

        // Function
        sort(arr, arr_size);
    }
}
