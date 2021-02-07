public class activatygreedy
{
    public static void time(int s[],int f[],int n)
    {
        int temp;
        for (int i = 0; i < s.length; i++)
        {
            for (int j = 1; j < (n - i); j++)
            {
                if (s[j - 1] > s[j])
                {
                    //swap elements
                    temp = s[j - 1];
                    s[j - 1] = s[j];
                    s[j] = temp;
                }
            }
        }

    }
    public static void  main(String [] args)
    {
        int s[] =  {1, 3, 0, 5, 8, 5};
        int f[] =  {2, 4, 6, 7, 9, 9};
        int n = s.length;
        time(s,f,n);

    }
}
