package Arrays;
/* Dutch National flag algorithm is used
Time complexity = o(n)
space complexity = o(1)
*/
public class Segregat_0_1 {
    public static void segregate(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int temp = 0;
        while (low < high) {
            while (arr[low] == 0 && low < high)
                low++;
            while (arr[high] == 1 && low < high)
                high--;
            if (low < high) {
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate(arr);
    }
}
