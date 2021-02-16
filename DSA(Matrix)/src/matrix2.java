import java.util.Scanner;

public class matrix2
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("Enter the value of k :");
        int k = sc.nextInt();
        int arr [][] = new int[r][c];
        for(int i =0 ;i <r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0 ;i <r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        for(int i =0 ;i <r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if (arr[i][j]==k)
                    System.out.print(true);
            }
            System.out.print("\n");
        }
    }
}
