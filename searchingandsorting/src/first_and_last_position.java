import java.util.Arrays;
import java.util.Scanner;

public class first_and_last_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element to be found: ");
        int x = sc.nextInt();
        System.out.println("Enter array elements :");
        int arr[] = new int[n];
        int reverse[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array");
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i < arr.length;i++)
        {
        reverse[i] = arr[arr.length-1-i];
        }
        System.out.println("Reversed array: ");
        System.out.println(Arrays.toString(reverse));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                System.out.println("first occurence : " + (i+1));
            break;

        }
        for (int i = 0; i < arr.length; i++) {
            if (reverse[i] == x)
                System.out.println("last occurence : " + (n-i));
            break;

        }
    }
}
