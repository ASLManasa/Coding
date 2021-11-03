package Arrys;

public class sort_0_1 {
    public static void sort(int a[]) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        int temp = 0;
        while (mid <= high) {
            switch (a[mid]) {
                case 0: {
                    //swap low and mid
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    //swap mid and high
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 0, 0, 1, 1, 0, 1, 2, 1, 2};
        sort(arr);
    }
}
