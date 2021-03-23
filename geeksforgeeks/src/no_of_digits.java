import java.util.Scanner;

public class no_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;
        while (T != 0) {

            T = T / 10;
            count++;

        }
        System.out.println(count);


    }
}
