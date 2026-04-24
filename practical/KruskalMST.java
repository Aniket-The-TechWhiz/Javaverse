import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }

    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }
}

class KruskalMST {
    static int[] parent;

    static int find(int i) {
        if (parent[i] == i)
            return i;
        return parent[i] = find(parent[i]);
    }

    static void union(int x, int y) {
        parent[find(x)] = find(y);
    }

    public static void main(String[] args) {
        int V = 4;

        Edge[] edges = {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };

        Arrays.sort(edges);

        parent = new int[V];
        for (int i = 0; i < V; i++) parent[i] = i;

        System.out.println("Edges in MST:");

        for (Edge edge : edges) {
            int x = find(edge.src);
            int y = find(edge.dest);

            if (x != y) {
                System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
                union(x, y);
            }
        }
    }
}