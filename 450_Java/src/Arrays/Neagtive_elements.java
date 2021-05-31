package Arrays;

import java.util.Arrays;

public class Neagtive_elements {
    public static void posneg(int arr[]) {
    /*approach 1 - sort the array
        Arrays.sort(arr);*/

        /*Approach -2
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }*/
        /*approach -3 time complexity o(n) space = o(1)*/
        int low = 0;
        int high = arr.length - 1;
        int temp = 0;
        {
            while (low < high) {
                if (arr[low] < 0 && arr[high] < 0)
                    low++;
                else if (arr[low] > 0 && arr[high] < 0) {
                    temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                } else if (arr[low] > 0 && arr[high] > 0) {
                    high--;
                } else {
                    low++;
                    high--;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6};
        posneg(arr);
    }
}
