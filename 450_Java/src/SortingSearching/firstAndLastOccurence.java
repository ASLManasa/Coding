package SortingSearching;

public class firstAndLastOccurence {
    public static int first(int arr[], int x, int low, int high) {

        while (high >= low) {
            int mid = (high + low) / 2;
            if (mid == 0 || x > arr[mid - 1] && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                first(arr, x, mid + 1, high);
            else if (x < arr[mid])
                first(arr, x, 0, mid - 1);

        }
        return -1;

    }

    public static int last(int arr[], int x, int low, int high) {
        while (high >= low) {
            int mid = (high + low) / 2;
            if (mid == arr.length - 1 || x < arr[mid + 1] && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                first(arr, x, mid + 1, high);
            else if (x < arr[mid])
                first(arr, x, 0, mid - 1);

        }
        return -1;


    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 8;
        int low = 0;
        int high = arr.length - 1;
        int mid = (high + low) / 2;
        System.out.println("First Occurrence = " +
                first(arr, x, low, high));
        System.out.println("Last Occurrence = " +
                last(arr, x, low, high));
    }
}
