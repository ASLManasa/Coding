import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[T + 1];
        while (T-- > 0) {
            for (int i = 0; i < T + 1; i++) {
                arr[i] = sc.nextInt();
            }
            int n = 5;
            for(int j =0;j< T;j++) {
                if (arr[j] / 5 > 1) {

                }
            }


        }
    }
}
