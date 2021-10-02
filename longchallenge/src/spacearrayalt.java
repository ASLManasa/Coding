import java.util.Arrays;
import java.util.Scanner;

public class spacearrayalt {
    public static void winner(int arr[], int N) {
        int diff = 0;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i+1 - arr[i] <0) {
                count = 1;
                break;
            }
            diff = diff+(i+1-arr[i]);

        }
        if(count ==1)
            System.out.println("Second");
        else if (diff%2==1)
            System.out.println("First");
        else
            System.out.println("Second");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            winner(arr, N);

        }
    }
}
