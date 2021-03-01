import java.util.Scanner;

public class seieve {
    public static void primes(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < prime.length; i++)
            prime[i] = true;

        for (int p = 2; p * p < n; p++) {
            if (prime[p] == true)
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
        }
        System.out.println("the prime numbers are:");
        for(int i =0;i< prime.length;i++)
        {
            if(prime[i] == true)
                System.out.println(i+" ");
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primes(n);
    }
}
