import java.util.Iterator;
import java.util.Stack;

public class vector_stack
{
    public static void main(String [] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        System.out.println(st);
        Iterator<Integer> itr = st.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();
    }
}
