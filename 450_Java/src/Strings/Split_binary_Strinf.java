package Strings;

public class Split_binary_Strinf {
    public static int split(String str) {
        int count0 = 0;
        int count1 = 0;
        int count = 0;
        int j=0;
        System.out.println("All substrings having equal 0's and 1's ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
            if (count0 == count1) {
                count++;

                System.out.println(str.substring(j,i+1));
                j = i+1;
            }

        }
        if (count == 0)
            return -1;
        return count;

    }

    public static void main(String[] args) {
        String str = "0100110101";
        System.out.println("Total number of substtrings  " +split(str));
    }
}