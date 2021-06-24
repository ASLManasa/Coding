package Strings;

import java.util.Arrays;

public class String_duplicates
{
    public static void duplicates(String s)
    {
       /* int count[] = new int[256];
        for(int i =0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
        }
        for(int i =0;i< count.length;i++)
        {
            if(count[i] >1)
                System.out.print((char) i + " " + count[i]);
        }*/
        char ch [] = s.toCharArray();
        int freq [] =new int[s.length()];
        for(int i =0;i<s.length();i++) {
            freq[i] = 1;
            for (int j = i + 1; j < s.length(); j++) {

                if (ch[i] == ch[j] && ch[i]!=' ') {
                    freq[i]++;
                    ch[j] = '0';
                }
            }

        }
       /* for(int i =0;i< freq.length;i++)
        {
            if(ch[i] != ' ' && ch[i] != '0')
                System.out.println(ch[i] + "-" + freq[i]);
        }*/
        for(int i =0;i< freq.length;i++)
        {
            if(freq[i] >1 && ch[i] != '0') {
                System.out.println(ch[i]);
            }
            else
                continue;
        }

    }
   public static void main(String [] args)
   {
       String s = "geeksforgeeks";
       duplicates(s);
   }
}
