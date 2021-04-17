package Searching;

public class Terenery_search {
    public static int search(int low, int high, int arr[], int x)
    {
        while(high >= low) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            if (arr[mid1] == x) {
                return mid1;
            } else if (arr[mid2] == x) {
                return mid2;
            } else if (x < arr[mid1]) {
                high = mid1 - 1;
            } else if (x > arr[mid2]) {
                low = mid2 + 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 6;
        int low = 0;
        int high = arr.length - 1;
       int ans =  search(low, high, arr, x);
       System.out.println("The index of the value "+ x +"  is : " + ans);

    }
}
