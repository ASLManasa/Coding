package Strings;

public class palindromic_subsequence
{
   /* public static boolean palin(String ans)
    {
        int i =0;
        int j = ans.length()-1;
        while (i <= j)
        {
            if(ans.charAt(i) != ans.charAt(j))
                return  false;
           else
            {
                i++;
                j--;
            }
        }
        return true;
    }*/
    public static void subsequence(String s,String ans,int i,int len)
    {
        if(i==len)
            System.out.println(ans);
        else {
            subsequence(s, ans, i + 1, len);
            ans = ans + s.charAt(i);
            subsequence(s, ans, i + 1, len);
        }

    }
    public static void main(String [] args)
    {
        String s ="abc";
        int i =0;
        int len = s.length();
        String ans ="";
        subsequence(s,ans,i,len);
    }
}
