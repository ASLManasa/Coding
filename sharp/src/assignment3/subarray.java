package assignment3;

public class subarray {
    public static void sub_array(int[] arr) {
        int j = 0;
        int i = 0;
        int k;
        while (i < arr.length) {
            j = i;
            while (j < arr.length) {
                k = i;
                while (k <= j) {
                    System.out.print(arr[k] + " ");
                    k++;
                }
                System.out.println();
                j++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6};
        sub_array(arr);
    }
}
