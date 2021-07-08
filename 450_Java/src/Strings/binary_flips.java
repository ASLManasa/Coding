package Strings;

import sun.security.util.Debug;

public class binary_flips {
    public static char flip(char ch) {
        return (ch == '0') ? '1' : '0';
    }

    public static int min_flips(String s) {
        int count_0 = 0;
        char ch = s.charAt(0);
        if (ch == '0') {
            char expected = ch;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != expected)
                    count_0++;
                expected = flip(expected);

            }
        } else {
            int count_1 = 1;
            char c = s.charAt(0);
            if (c == '0') {
                char expected = c;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) != expected)
                        count_1++;
                    expected = flip(expected);


                }
                return Math.min(count_0, count_1);


            }


            public static void main(String [] args){
                String str = "0001010111";
                System.out.println(min_flips(str));
            }
        }
    }
}
