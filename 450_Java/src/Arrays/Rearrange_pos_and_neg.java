package Arrays;

public class Rearrange_pos_and_neg {
    public static void rotate(int arr[], int from, int to) {
        int temp = arr[to];
        for (int i = to; i > from; i--)
        {  arr[i] = arr[i - 1];}

        arr[from] = temp;
    }

    public static void rearrange(int arr[]) {
        int wrong_Index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (wrong_Index != -1) {
                if (arr[wrong_Index] >= 0 && arr[i] < 0 || arr[wrong_Index] < 0 && arr[i] >= 0)
                    rotate(arr, wrong_Index, i);
                if (i - wrong_Index >= 2)
                    wrong_Index += 2;
                else
                    wrong_Index = -1;

            } else {
                if (arr[i] < 0 && i % 2 == 1 || arr[i] >= 0 && i % 2 == 0) {
                    wrong_Index = -1;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr);
    }
}
