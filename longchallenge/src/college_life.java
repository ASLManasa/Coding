import java.util.Scanner;

public class college_life {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int final_omlet =0;
            int final_milkshake = 0;
            int cakes;
            int N = sc.nextInt();//n-1 friends
            int H = sc.nextInt();//chocolate
            int E = sc.nextInt();//eggs
            int A = sc.nextInt();//omletcost
            int B = sc.nextInt();//milkshake
            int C = sc.nextInt();//cake
            int answer = (int) 1e18;
            for (cakes = 0; cakes <= N; cakes++) {
                if (E < cakes || H < cakes)
                    break;
                int omlet = (E - cakes) / 2;
                int milkshake = (H - cakes) / 3;
                if (cakes + omlet + milkshake < N)
                    continue;

                if (A < B) {
                    final_omlet = Math.min(omlet, N - cakes);
                    final_milkshake = N - cakes - final_omlet;
                } else
                    final_milkshake = Math.min(milkshake, N - cakes);
                final_omlet = N - cakes - final_milkshake;


                int price = cakes * C + final_omlet * A + final_milkshake * B;
                answer = Math.min(answer, price);
            }
            if (answer == 1e18)
                answer = -1;

            System.out.println(answer);


        }
    }
}
