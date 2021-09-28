package Strings;

public class Substring {

    public static void substringString(char arr[], int n, String s) {
  /*      1st-approach
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.println(s.substring(i,j));
            }
        }
        */

//        2nd approach
       for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(s.charAt(k));
                }
                System.out.println();
            }
        }



    }

    public static void main(String[] args) {
        String s = "abcd";
        char arr[] = s.toCharArray();
        substringString(arr, s.length(), s);
    }
}
