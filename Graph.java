import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Graph {
    // Attributs
    private int vertices; // number of vertices
    private int adjm[][]; // adjacency matrix
    private Queue<Integer> queue; // queue for bfs
    private List<Integer> visited; // visited list
    private List<Integer> distance; // distance list for BFS

    // Constructor
    public Graph(int v) {
        this.vertices = v;
        visited = new ArrayList<>();
        distance = new ArrayList<>();
        queue = new ArrayDeque<>();
        adjm = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                adjm[i][j] = 0;
            }
            visited.add(0);
            distance.add(Integer.MIN_VALUE);
        }
    }

    // Methods
    public int getVertices() {
        return this.vertices;
    }

    public boolean checkVisited(int v) {
        int res = visited.get(v);
        if (res == 1) {
            return true;
        }
        return false;
    }

    public int getDistance(int v) {
        return distance.get(v);
    }

    public void addEdge(int src, int dest) {
        adjm[src][dest] = 1; // considering directed graph
    }

    public void display() {
        for (int i = 0; i < this.vertices; i++) {
            for (int j = 0; j < this.vertices; j++) {
                System.out.print(adjm[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public void bfs(int start) {
        queue.offer(start); // adding the element to queue
        this.visited.set(start, 1);
        this.distance.set(start, 0);
        System.out.println("\nThe BFS traversal is:\n");
        while (!queue.isEmpty()) {
            int x = queue.poll(); // remove the first element of the queue
            System.out.print(x + "\t");
            for (int i = 0; i < this.vertices; i++) {
                if (adjm[x][i] == 1 && visited.get(i) != 1) {
                    queue.offer(i);
                    visited.set(i, 1);
                    distance.set(i, distance.get(x) + 1);
                }
            }
        }
        System.out.println("\n");
    }
}