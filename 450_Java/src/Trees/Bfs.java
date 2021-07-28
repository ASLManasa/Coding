package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph_Bfs {
    ArrayList<ArrayList<Integer>> graph;
    int V;

    Graph_Bfs(int nodes) {
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

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Nodes i :");
            for (int x : graph.get(i)) System.out.print("->" + x);
            System.out.println();
        }
    }

    void dfsUtil(int node, boolean visited1[]) {
        visited1[node] = true;
        System.out.print(node + " ");
        for (int x : graph.get(node)) {
            if (visited1[x] == false) {
                dfsUtil(x, visited1);
            }
        }
    }

    void Dfs(int start) {
        boolean visited1[] = new boolean[V];
        System.out.println("Dfs Traversal");
        dfsUtil(start, visited1);
    }

    void BFS(int start) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        System.out.println("BFS Traversal");
        visited[start] = true;
        while (q.isEmpty() == false) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int x : graph.get(node)) {
                if (visited[x] == false) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }
}

public class Bfs {
    public static void main(String[] args) {
        Graph_Bfs g = new Graph_Bfs(5);


        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.printGraph();
        System.out.println();
        g.BFS(0);
        System.out.println();
        g.Dfs(2);


    }
}
