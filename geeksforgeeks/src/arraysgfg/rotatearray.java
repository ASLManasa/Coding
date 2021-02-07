package arraysgfg;

import java.util.Scanner;

public class rotatearray
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int N = sc.nextInt();
            int D = sc.nextInt();
            int[] arr = new int[N];
            //int [] temp = new int[D];
            //int[] arr2 = new int[k];
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < D+1; i++) {
                for (int j = arr.length - 1; j > 0; j--) {
                    // move each number by 1 place
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            for(int h =0; h < arr.length;h++)
            {
                System.out.print(arr[h]+" ");
            }

        }
    }
}
