import java.util.Scanner;

public class coinflip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {

            int G = sc.nextInt();
           while (G-->0)
            {
                int i= sc.nextInt();
                int n = sc.nextInt();
                int q = sc.nextInt();

                if( i ==q)
                    System.out.println(n/2);
                else
                    System.out.println(n-n/2);
            }
        }

    }
}
