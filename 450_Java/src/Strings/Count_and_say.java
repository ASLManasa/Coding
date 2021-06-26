package Strings;

public class Count_and_say
{
    /*Approach -1  Time Complexity :o(n^2)*/

    public static String count_and_say(int n) {
        if (n == 1) {
            return "1";
        }

        String myans = count_and_say(n - 1);
        int i = 0;
        StringBuilder finalans = new StringBuilder();
        while (i < myans.length()) {
            int count = 0;
            char c = myans.charAt(i);
            while (i < myans.length() && myans.charAt(i) == c) {
                i++;
                count++;
            }
            finalans.append(count);
            finalans.append(c);
        }
        return finalans.toString();
    }
    public static void main(String [] args)
    {
        int n =4;
        System.out.print(count_and_say(n));
    }
}
