import java.util.Scanner;

public class duplicateschar
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        char [] arr = s.toCharArray();
        System.out.println("Duplicate charachters are : ");
        for(int i =0;i<s.length();i++)
        {
            for(int j =i+1;j <s.length();j++)
            {

                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]+" ");
                   break;
                }
               // break;


            }
        }
    }
}
