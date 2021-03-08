import java.util.Scanner;

public class recuringchar {
    public static String recur(String s) {
        char [] chars = s.toCharArray();
        char prev = '\0';
        int k = 0;

        for (char c: chars)
        {
            if (prev != c)
            {
                chars[k++] = c;
                prev = c;
            }
        }

        return new String(chars).substring(0, k);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(recur(s));

    }
}
