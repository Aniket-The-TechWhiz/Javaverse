import java.util.*;

public class GraphTraversal {

    // Number of vertices
    private int vertices;

    // Adjacency list
    private LinkedList<Integer>[] adjList;

    // Constructor
    GraphTraversal(int v) {
        vertices = v;

        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge (Undirected Graph)
    void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    // ---------------- DFS ----------------

    void DFS(int startVertex) {

        boolean[] visited = new boolean[vertices];

        System.out.println("DFS Traversal:");

        dfsRecursive(startVertex, visited);
    }

    // Recursive DFS function
    void dfsRecursive(int vertex, boolean[] visited) {

        visited[vertex] = true;

        System.out.print(vertex + " ");

        for (int neighbor : adjList[vertex]) {

            if (!visited[neighbor]) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    // ---------------- BFS ----------------

    void BFS(int startVertex) {

        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;

        queue.add(startVertex);

        System.out.println("\nBFS Traversal:");

        while (!queue.isEmpty()) {

            int vertex = queue.poll();

            System.out.print(vertex + " ");

            for (int neighbor : adjList[vertex]) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;

                    queue.add(neighbor);
                }
            }
        }
    }

    // Main Method
    public static void main(String[] args) {

        GraphTraversal graph = new GraphTraversal(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        // DFS
        graph.DFS(0);

        // BFS
        graph.BFS(0);
    }
}