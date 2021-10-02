import java.util.Scanner;

public class chefanggroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count =0;
        while (T-- > 0) {
            String s = sc.next();

            String str[] = s.split("0", 0);
            char [] ch = s.toCharArray();
               for(int i =0;i< str.length;i++)
               {
                   if(ch[i]!= '0')
                       count++;
               }

            if(count!=0 )
                System.out.println(0);
           else if (s.startsWith("0") == true && count>0) {
                System.out.println(str.length - 1);
            } else {
                System.out.println(str.length);
            }
        }
    }
}
