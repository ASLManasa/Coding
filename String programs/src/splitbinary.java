public class splitbinary {
    public static int div(String s, int n) {
        int count0 = 0;
        int count1 = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                count0++;
            else
                count1++;
            if (count0 == count1)
                count++;
        }
        if (count0 != count1)
            return -1;
        return count;
    }

    public static void main(String[] args) {
        String s = "0100110101";
        int n = s.length();
       System.out.println( div(s, n));
    }
}
