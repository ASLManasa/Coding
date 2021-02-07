import java.util.Scanner;
import java.util.Arrays;

public class kmaxmin {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i =0;i< arr.length;i++)
        {
            for(int j =1;j<(n-i);j++)
            {
                if(arr[j-1] > arr [j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting");
        for(int h =0;h<n;h++)
        {
            System.out.print(arr[h]+" ");
        }
        System.out.println(" ");
        //System.out.println("The required k element is :"+ arr[k-1]);
       // System.out.println("The required k element is :"+ arr[n-k]);
        int a[] = new int[n];
        for(int l = 0;l<n;l++)
        {
            a[l] = arr[n-l-1];
        }
        System.out.println("descending order");
        for(int m =0;m< a.length;m++)
        {
            System.out.print(a[m]+" ");
        }
        System.out.println(" ");
        System.out.println("The required k element is :"+ arr[k]);
        System.out.println("The required k element is :"+ a[k]);

    }
}

