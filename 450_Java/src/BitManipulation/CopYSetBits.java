package BitManipulation;

import java.util.*;

public class CopYSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();

        int mask = (1 << (r - l + 1));
        mask--;
        mask = (mask << (l - 1));
        mask = (mask & x);
        y = y | mask;
        System.out.println(y);

    }
}
