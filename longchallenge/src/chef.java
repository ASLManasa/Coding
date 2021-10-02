import java.util.Scanner;

public class chef
{
    public static int chefs(String s)
    {
        int count =0;
        char [] ch = s.toCharArray();
        if(ch[0] =='1')
            count++;
        for(int i=1 ;i<ch.length;i++)
        {
            if(ch[i] == '1' && ch[i]!= ch[i-1])
                count++;
        }
    return count;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i =0;i<T;i++){
            String s = sc.next();
            System.out.println(chefs(s));
        }
    }
}
