package Graphs;

import java.util.*;


//printing using dfs
class graph_create {
    ArrayList<ArrayList<Integer>> graph;
    int V;

    graph_create(int nodes) {
        V = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int u) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    void dfs_recursion(int node, boolean visited1[]) {
        visited1[node] = true;
        System.out.print(node + " ");
        for (int x : graph.get(node)) {
            if (visited1[x] == false) {
                dfs_recursion(x, visited1);
            }
        }

    }

    void dfs(int start) {
        boolean visited1[] = new boolean[V];
        System.out.println("Dfs Traversal");
        dfs_recursion(start, visited1);
    }

    void bfs(int start) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        System.out.println("BFS Traversal");
        visited[start] = true;
        while (q.isEmpty() == false) {
            int node = q.poll();
            System.out.print(node+" ");
            for (int x : graph.get(node))
                if (visited[x] == false) {
                    visited[x] = true;
                    q.add(x);
                }

        }
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Nodes i :");
            for (int x : graph.get(i)) System.out.print(" ->" + x);
            System.out.println();
        }
    }
}

public class printGraph {
    public static void main(String[] args) {
        graph_create g = new graph_create(7);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 5);
        g.addEdge(4, 6);
        g.addEdge(5, 6);
        g.addEdge(4, 5);

        g.printGraph();
        g.dfs(1);
        System.out.println(" ");
        g.bfs(1);

    }
}
