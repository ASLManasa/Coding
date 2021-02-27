import java.util.Locale;
import java.util.Scanner;

public class vowels
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int countv =0; int countc =0;
        char [] arr = s.toCharArray();
        for(int i =0;i< arr.length;i++)
        {
            if(arr[i] == 'a'||arr[i] == 'e'||arr[i] == 'i'||arr[i] == 'o'||arr[i] == 'u')
            {
                countv++;
            }
            else
                countc++;

        }
        System.out.println("no of vowels: " + countv);
        System.out.println("no of consonants: " + countc);
    }
}
