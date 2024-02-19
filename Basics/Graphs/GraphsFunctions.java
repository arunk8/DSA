package Graphs;

import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer>[] adjacencyList;

    // Constructor
    Graph(int v) {
        V = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjacencyList[i] = new LinkedList();
        
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }

    // Function to perform Breadth First Search (BFS) traversal
    void BFS(int startVertex) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            startVertex = queue.poll();
            System.out.print(startVertex + " ");

            Iterator<Integer> iterator = adjacencyList[startVertex].listIterator();
            while (iterator.hasNext()) {
                int n = iterator.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Function to perform Depth First Search (DFS) traversal
    void DFS(int startVertex) {
        boolean[] visited = new boolean[V];
        DFSUtil(startVertex, visited);
    }

    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> iterator = adjacencyList[v].listIterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
}

public class GraphsFunctions {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Breadth First Traversal (starting from vertex 2):");
        g.BFS(2);

        System.out.println("\nDepth First Traversal (starting from vertex 2):");
        g.DFS(2);
    }
}
