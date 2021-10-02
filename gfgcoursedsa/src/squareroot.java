import java.util.Scanner;

public class squareroot {
    public static int val(int N)
    {
        int value=0;
        for(int i =1;i<=N;i++)
        { if(i*i >N)
               value = i-1;
            break;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            if (i * i == N)
                System.out.println("square root of " + i);
            else {
                System.out.print(val(N));
            }



        }


    }
}

