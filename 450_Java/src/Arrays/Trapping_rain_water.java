package Arrays;
/* Time Complexity :o(n) */
public class Trapping_rain_water {
    static int trappingWater(int arr[], int n) {
        int ans = 0;
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            ans += Math.min(left[i], right[i]) -(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 0, 0, 2, 0, 4};
        int n = arr.length;
        System.out.println(trappingWater(arr, n));
    }

}
