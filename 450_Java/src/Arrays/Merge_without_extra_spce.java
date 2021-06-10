package Arrays;

import java.util.Arrays;

public class Merge_without_extra_spce {
    public static void merge(int arr1[], int arr2[]) {
      /*  Approach -1
      int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i++;
               Arrays.sort(arr2);
            } else {
                i++;
            }
        }*/
        /*Approach -2 */
        int i = arr1.length - 1, j = 0;
        while (i >= 0 && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int k : arr1)
        {
            System.out.print(k+" ");
        }
        System.out.println("\n");
        for(int l : arr2)
        {
            System.out.print(l+" ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 3, 5, 7,9};
        int arr2[] = new int[]{0, 2, 6, 8 };
        merge(arr1, arr2);
    }
}
