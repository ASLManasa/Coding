import java.util.Arrays;

public class merge_two_arrays {
    public static void main(String[] args)
    {
        int[]a = {1,2,8,4};
        int[]b = {4,16,1,1,3,22};
        int [] arr = new int[a.length+b.length];
        int count =0;
        for (int i =0;i<a.length;i++)
        {
            arr[i] = a[i];
            count++;
        }
        for(int j = 0; j < b.length;j++) {
            arr[count++] = b[j];
        }
        Arrays.sort(arr);
        for(int c: arr)
        {
            System.out.print(c+" ");
        }
    }

}
