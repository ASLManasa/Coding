import java.util.Scanner;

public class jewls
{
    public static int find(String J, String S,char ch1[],char ch2 [])
    {
        int count =0;
            for(int i =0;i<J.length();i++)
            {
                for(int j =0;j<S.length();j++)
                {
                    if(ch2[i] == ch1[j])
                        count++;
                        System.out.print(i);
                }
            }
            return count;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0)
        {
            String S = sc.next();
            String J = sc.next();
            /*String S = sc.next();
            String[] jewel = J.split("");
            String[] mined = S.split("");
            char[] ch1 = new char[S.length()];
            char[] ch2 = new char[J.length()];*/
            char[] ch1 = S.toCharArray();
            char[] ch2 = J.toCharArray();

            System.out.print(find(J,S,ch1,ch2));
            System.out.print(" ");
            System.out.println(J.length());
            System.out.println(S.length());
            /*for (char c : ch1) {
                System.out.println(c);
            }*/

        }
    }
}
