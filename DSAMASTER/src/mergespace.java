public class mergespace
{
    public static void merge(int arr1[],int arr2[])
    {
        int  temp;
        for(int i =0;i<arr1.length;i++)
        {
            for(int j =0;j< arr2.length;j++)
            {
                if(arr1[i] > arr2[j])
                {
                    temp = arr1[i];
                    arr1[i]=arr2[j];
                    arr2[j] = temp;
                }

            }
        }

    }
    public static void union(int arr1[],int arr2[]){
        int i =0; int j =0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <arr2[j])
            {
                System.out.print(arr1[i++]+" ");
            }
            else if(arr2[j] < arr2[i])
            {
                System.out.print(arr2[j++]+" ");
            }
            else{
                System.out.print(arr2[j++]+" ");
                i++;
            }
        }
        while (i < arr1.length)
            System.out.print(arr1[i++] + " ");
        while (j < arr2.length)
            System.out.print(arr2[j++] + " ");


    }
    public static void main(String[] args)
    {
        int arr1 []={1, 3, 5, 7};
        int arr2 [] ={0, 2, 6, 8, 9};
        merge(arr1,arr2);
        union(arr1,arr2);
        System.out.print(" ");
       /* for(int i =0;i< arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.print("\n");


        for(int i =0;i< arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }*/
    }
}
