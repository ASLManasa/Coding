import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import  java.util.*;
public class hasharray
{

    public static void main(String [] args)
    {
  Scanner sc = new Scanner(System.in);
  int T = sc.nextInt();
  while(T-- >0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            Integer arr1 []=new Integer[m];
            Integer arr2 [] = new Integer[n];
            for(int i =0;i< arr1.length;i++)
            {
                arr1[i] = sc.nextInt() ;
            }
            for(int j =0;j< arr2.length;j++)
            {
                arr1[j] = sc.nextInt() ;
            }
           // Set<Integer> set1 = new HashSet<Integer>();
            Set<Integer> set1 = new HashSet<Integer>();
            Set<Integer> set2 = new HashSet<Integer>();
            set1.addAll(Arrays.asList(arr1));
            set1.addAll(Arrays.asList(arr2));
            Set<Integer> intersection = new HashSet<Integer>(set1);
          boolean b = intersection.retainAll(set2);
          if(b == true)
              System.out.print("\"yes\" ");
          else
              System.out.print("\"no\" ");



        }
    }
}
