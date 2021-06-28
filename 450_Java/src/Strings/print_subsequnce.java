package Strings;
/* subsequnce will be  always 2^len(string) and will have one emply string */
public class print_subsequnce {
    public static void subsequnce(String ans, int i, int len, String s) {
        if(i==len)
            System.out.println(ans);
        else
        {
            subsequnce(ans,i+1,len,s);
            ans = ans+s.charAt(i);
            subsequnce(ans,i+1,len,s);
        }

    }

    public static void main(String[] args) {
        String s = "abc";
        int i = 0;
        int len = s.length();
        subsequnce("  ", i, len, s);
    }
}
