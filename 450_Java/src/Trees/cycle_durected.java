package Trees;

import java.util.*;

public class cycle_durected {
    final int V;
    final List<List<Integer>> adj;

    public cycle_durected(int V) {
        this.V = V;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }


    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }

    boolean isCyclicUtil(int i, boolean visited[], boolean recStack[]) {
        if (recStack[i] == true)
            return true;
        if (visited[i] == true)
            return true;
        visited[i] = true;
        recStack[i] = true;
        List<Integer> children = adj.get(i);

        for (Integer c : children)
            if (isCyclicUtil(c, visited, recStack))
                return true;

        recStack[i] = false;

        return false;
    }

    boolean isCyclic() {
        boolean visited[] = new boolean[V];
        boolean recursive_stack[] = new boolean[V];
        for (int i = 0; i < V; i++)
            if (isCyclicUtil(i, visited, recursive_stack))
                return true;

        return false;


    }

    public static void main(String[] args) {
        cycle_durected graph = new cycle_durected(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        if (graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't "
                    + "contain cycle");
    }
}
