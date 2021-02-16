import java.util.Scanner;

public class arrayrev
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- >0){
        int sum = 0;
        int n = sc.nextInt();
        int rev =  0;
        while(n > 0){
            sum = (sum * 10) + n%10;
            n /= 10;
        }
        System.out.println(sum);
        }
    }
}
