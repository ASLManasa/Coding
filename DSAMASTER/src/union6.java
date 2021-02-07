public class union6
{
    public static int uni(int[] a, int[] b, int m, int n)
    {
        int i =0; int j =0;
        while(i <m && j <n)
        {
            if(a[i] <b[j])
            {
                System.out.print(a[i++]+" ");
            }
            else if(b[j] < a[i])
            {
                System.out.print(b[j++]+" ");
            }
            else{
                System.out.print(b[j++]+" ");
                i++;
            }
        }
        while (i < m)
            System.out.print(a[i++] + " ");
        while (j < n)
            System.out.print(b[j++] + " ");

        return 0;
    }
    public static void main(String [] args)
    {
        int a []= {1,2,3,4,5};
        int b[] ={1,2,3};
        int m = a.length;
        int n =b.length;
        uni(a,b,m,n);


    }
}
