import java.util.Vector;

public class Basic_vector
{
    public static void main(String [] args)
    {
        Vector<Integer> vec = new Vector<>(2);
      for(int i =0;i <= 5;i++)
      {
          vec.add(i);
      }

    System.out.println(vec);

    }
}
