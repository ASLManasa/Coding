package Strings;

public class duplicate_characters {
    static final int NO_OF_CHARS = 256;

    public static void printDups(String str) {

        int count[] = new int[NO_OF_CHARS];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
//        for(int j =0;j<count.length;j++)
//        {
//            if (count[j] > 1)
//                System.out.println((char)(j) +
//                        ", count = " + count[j]);
//        }
    }

    public static void freqeuncy(String str) {
        int freq[] = new int[str.length()];
        char ch[] = str.toCharArray();
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < freq.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;

                    ch[j] = '0';
                }
            }
        }


        for (int k = 0; k < freq.length; k++) {
            if (ch[k] != ' ' && ch[k] != '0')
                System.out.println(ch[k] + "-" + freq[k]);
        }

    }

    public static void main(String[] args) {
        String str = "teststring";
        printDups(str);
        freqeuncy(str);
    }
}
