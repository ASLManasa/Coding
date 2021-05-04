package Strings;

public class kmp
{
    public static void kmp_search(String text , String pattern)
    {
        int X = text.length();
        int Y = pattern.length();
        if(pattern == null || Y == 0)
        {
            System.out.println("The pattern is occured at 0 index");
            return;
        }
        if(text == null || Y > X)
        {
            System.out.println("The pattern is not occured ");
            return;
        }
        char [] chars = pattern.toCharArray(); // for the table lps
        int [] next = new int[Y+1];
        for(int i =0;i< chars.length;i++)
        {
            int j = next[i+1];  // function
            while (j >0 &&chars[j]!= chars[i])
            {
                j = next[j];  // backtrack to the value in the pattern
            }
            if( j >0 ||chars[j]==chars[i])
            {
                next[i+1] = j+1; //if equa then write the same value and incremment
            }
        }
        int j =0;
        for(int i =0;i<X;i++)
        {
            if(j < Y && text.charAt(i) == pattern.charAt(j))
            {
                if(++j == Y)
                {
                    System.out.println("The pattern occurs with shift " + (i - j + 1)); // find the pattern
                }
            }
            else if (j > 0)
            {
                j = next[j]; // go back in the pattern and start again from where needed
                i--;
            }
        }

    }
    public static void main(String [] args)
    {
        String text = "ABCABAABCABAC";
        String pattern = "CAB";

        kmp_search(text, pattern);
    }
}
