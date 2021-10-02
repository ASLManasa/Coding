import javax.swing.*;
import java.util.Scanner;

public class Least_divisible {
    public static int divisible(int arr[]) {
        int minimum;
        int maximum;
        int lcm = 0;
        int x;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    minimum = arr[j];
                    maximum = arr[i];
                } else {
                    minimum = arr[i];
                    maximum = arr[j];

                }
                for (int k = 0; k < arr.length; k++) {
                    x = k * maximum;
                    if (x % minimum == 0) {
                        lcm = x;
                    }
                }


            }
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int j = 0;
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {

            // System.out.println(arr[i]);
            arr[i] = i + 1;
        }
        /*for(int i :arr)
        {
            System.out.println(i);
        }*/
        System.out.println(divisible(arr));
    }
}
