package arraysgfg;

public class fact
{
    public static int digitsInFactorial(int N){
        int count =0;
        int fact =1;

        for(int i =1;i<=N;i++)
        {
            fact = fact*i;
        }


        while(fact!=0)
        {
            fact= fact/10;
            ++count;
        }
        return count;
    }
    public static void main(String [] args)
    {
        int N = 120;
     System.out.print(digitsInFactorial(N));

    }
}
