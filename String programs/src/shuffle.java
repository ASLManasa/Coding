import java.util.Scanner;

public class shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s5 = sc.next();
        char [] s6 = s5.toCharArray();
        String s1 = "XY";
        String s2 = "12";
        String s3 = s1.concat(s2);
        // System.out.println(s3);
        char[] s4 = s3.toCharArray();
       /* for(int i =0;i<s4.length;i++)
        {
            System.out.println(s4[i]+" ");
        }*/
        int j =0;
        String ch = "X";
        if(s4.length == s6.length)
        {
            for(int i =0;i<s4.length;i++)
            {
                while (j < s5.length())
                {
                    if(s4[i] == s6[j] && s6[0] == 1 || s6[1] == '1' && s6[0] == 'X' || s6[1] == 'X')
                    {
                        j++;
                    }
                    else
                        break;
                }
            }
            System.out.println("valid");
        }
        else
            System.out.println("not valid");
    }
}
