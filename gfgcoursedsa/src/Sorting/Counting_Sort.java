package Sorting;

public class Counting_Sort {
    public static void sort(int arr[]) {
        int output[] = new int[arr.length];
        int count[] = new int[256];
        for (int i = 0; i < arr.length; i++)
            count[i] = 0;
        for (int i = 0; i < arr.length; i++)
            ++count[arr[i]];
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] -1 ] = arr[i];
            --count[arr[i]];
        }
        for (int i = 0; i < arr.length; ++i)
            arr[i] = output[i];
    }




    public static void main(String[] args) {
        int arr[] = new int[]{1, 4, 1, 2, 7, 5, 2};
        sort(arr);
        for(int i: arr)
            System.out.println(i);


    }
}
