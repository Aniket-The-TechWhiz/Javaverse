import java.util.*;

class Node {
    int x, y, g, h;
    Node parent;

    Node(int x, int y, int g, int h, Node parent) {
        this.x = x;
        this.y = y;
        this.g = g;
        this.h = h;
        this.parent = parent;
    }

    int f() {
        return g + h;
    }
}

class AStarExample {
    static int[][] grid = {
        {0, 0, 0},
        {1, 1, 0},
        {0, 0, 0}
    };

    static int heuristic(int x, int y, int goalX, int goalY) {
        return Math.abs(x - goalX) + Math.abs(y - goalY); // Manhattan
    }

    public static void main(String[] args) {
        int startX = 0, startY = 0;
        int goalX = 2, goalY = 2;

        PriorityQueue<Node> open = new PriorityQueue<>(Comparator.comparingInt(Node::f));
        boolean[][] visited = new boolean[3][3];

        open.add(new Node(startX, startY, 0, heuristic(startX, startY, goalX, goalY), null));

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        while (!open.isEmpty()) {
            Node current = open.poll();

            if (current.x == goalX && current.y == goalY) {
                System.out.println("Path found!");
                return;
            }

            visited[current.x][current.y] = true;

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < 3 && ny < 3 &&
                    grid[nx][ny] == 0 && !visited[nx][ny]) {

                    open.add(new Node(nx, ny,
                            current.g + 1,
                            heuristic(nx, ny, goalX, goalY),
                            current));
                }
            }
        }

        System.out.println("No path found");
    }
}