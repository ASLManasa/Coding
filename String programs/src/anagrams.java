import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class anagrams
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s5 = sc.next().toLowerCase(Locale.ROOT);
        String s1 = s5.replaceAll("\\s","");
        String s6 = sc.next().toLowerCase(Locale.ROOT).trim();
        String s2 = s6.replaceAll("\\s","");
        char [] s3 = s1.toCharArray();
        char [] s4 = s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);
       if(s3.length == s4.length)
       {
           for(int i=0;i< s3.length;i++)
           {
               for (int j =0;j<s4.length;j++)
               {
                   if(s3[i] == s4[j])
                       continue;
               }
           }
           System.out.println("anagram");
       }
       else
           System.out.println("not an anagram");

    }
}
