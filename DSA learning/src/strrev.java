import java.util.Scanner;

public class strrev
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String arr[] = new String[T+1];
        for(int i =0;i<T+1;i++)
        {
            arr[i] = sc.nextLine();
        }
        for(int j =0 ;j <arr.length+1;j++)
        {
            StringBuffer sbr = new StringBuffer(arr[j]);
            sbr.reverse();
            System.out.print(sbr+"\n");
        }
    }
}
