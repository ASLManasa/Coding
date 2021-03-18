import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Basic_Queue
{
    public static void main(String [] args){
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("This");
        q.add("is");
        q.add("a");
        q.add("queue");
        System.out.println(q);
    }
}
