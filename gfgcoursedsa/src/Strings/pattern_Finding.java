package Strings;

public class pattern_Finding
{
    public static void search(String s1, String s2)
    {
        int str1leng = s1.length();
        int str2leng = s2.length();


       for(int i =0;i<= str1leng-str2leng;i++)
       {
           int j ;
           for(j =0;j< str2leng;j++)

               if(s1.charAt(i+j) != s2.charAt(j))
                   break;
               if(j == str2leng)
                   System.out.println("Pattern found at index " + i);

       }
    }
    public static void main(String [] args)
    {
        String s1 = "AABAACAADAABAAABAA";
        String s2 = "AABA";
        search(s1,s2);
    }
}
