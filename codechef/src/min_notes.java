import java.util.Arrays;
import java.util.Scanner;

public class min_notes {
    public static int notes(int arr[]) {
        Arrays.sort(arr);
        arr[arr.length - 1] = arr[0];
        Arrays.sort(arr);
        int value = arr[0];
        int notes = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % value != 0)
                value = 1;
            else
                value = arr[0];
        }
      /*  for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }*/
        //System.out.println(value);
        for (int i = 0; i < arr.length; i++) {
            notes = notes + (arr[i] / value);
            //System.out.println(notes);
        }
        return notes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(notes(arr));
        }
    }
}
