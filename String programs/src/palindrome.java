import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       /* StringBuilder input = new StringBuilder();
        input.append(s);
        input.reverse();
        System.out.println(input);*/
        char[] try1 = s.toCharArray();
        //char[] try2 = s.toCharArray();
        int n = try1.length;
        char[] try3 = new char[n];
        for (int j = try1.length - 1; j >= 0; j--) {
            for (int i = 0; i < try3.length; i++) {
                try3[i] = try1[j];

            }
        }
        for(int i =0;i< try3.length;i++)
        {
            System.out.println(try3[i]);
        }

    }
}


