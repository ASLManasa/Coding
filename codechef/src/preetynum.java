import java.util.Scanner;

public class preetynum {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T-- >0) {
                int L = sc.nextInt();
                int R = sc.nextInt();
                int count = 0;
                for (int i = L; i < R+1; i++) {
                    if (i % 10 == 2 || i % 10 == 3 || i % 10 == 9) {
                        count++;
                    }
                }
                System.out.print(count);
            }
            sc.close();
        }

        catch (Exception e){};

}
}
