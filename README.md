# Breadth-First Search (BFS) Traversal using Adjacency Matrix in Java

## 📌 Project Overview

This project provides an object-oriented implementation of the **Breadth-First Search (BFS)** algorithm for directed graphs using an **adjacency matrix** representation. The program accepts dynamic input for the number of vertices and edges, performs BFS traversal from a given start vertex, and also computes the shortest distance (in terms of number of edges) from the source to a target vertex.

The program handles **disconnected graphs** by ensuring BFS is called on all unvisited nodes, thereby covering all connected components.

---

## 💡 Features

- Dynamic creation of directed graphs using adjacency matrix
- Breadth-First Search (BFS) traversal with distance tracking
- Detection and handling of disconnected components
- Input validation to ensure correctness of graph data
- Distance computation from a source to a target vertex

---

## 🛠️ Technologies Used

- **Language:** Java
- **Data Structures:**
  - `ArrayList` for visited status and distance tracking
  - `ArrayDeque` for BFS queue
  - 2D `int[][]` array for adjacency matrix representation

---

## 📂 File Structure

```
📁 BFSGraphTraversal
├── Graph.java       # Graph data structure with BFS implementation
└── Main.java        # Driver code for user input and invoking BFS
```

---

## 🔎 How It Works

1. **Input**

   - Number of vertices and edges
   - Edge connections (source → destination)
   - Starting vertex for BFS
   - Target vertex to compute distance

2. **Graph Construction**

   - Graph is internally represented using a `vertices x vertices` matrix.
   - Each entry `adjm[i][j] = 1` indicates a directed edge from `i` to `j`.

3. **BFS Traversal**

   - Initiated from the user-provided start vertex.
   - Tracks visited nodes and their corresponding distances from the source.
   - Automatically runs BFS for unvisited components.

4. **Distance Calculation**
   - After BFS, retrieves and displays the shortest path length from source to target using the `distance` list.

---

## 📌 Sample Execution Flow

```text
Enter number of vertices: 5
Enter number of edges: 4

Edge 1
Enter source vertex: 0
Enter dest vertex: 1

Edge 2
Enter source vertex: 0
Enter dest vertex: 2

Edge 3
Enter source vertex: 1
Enter dest vertex: 3

Edge 4
Enter source vertex: 2
Enter dest vertex: 4

The graph is:
0 1 1 0 0
0 0 0 1 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0

Enter a start vertex: 0

The BFS traversal is:
0 1 2 3 4

Enter end vertex to calculate distance: 4
The result is: 2
```

---

## 📘 Class Descriptions

### `Graph.java`

- `Graph(int v)`  
  Initializes the adjacency matrix and tracking lists.

- `addEdge(int src, int dest)`  
  Adds a directed edge from `src` to `dest`.

- `bfs(int start)`  
  Performs BFS from the given start vertex, prints traversal order, and updates distances.

- `getDistance(int v)`  
  Returns the BFS distance from the start node to node `v`.

- `checkVisited(int v)`  
  Returns whether the node `v` was visited.

- `display()`  
  Prints the adjacency matrix of the graph.

### `Main.java`

- Accepts user input and handles validation.
- Invokes graph construction and BFS methods.
- Handles both connected and disconnected graphs.
- Retrieves distance to the destination vertex after BFS.

---

## 🧪 Input Constraints

- Vertex numbering starts from `0` to `V-1`
- Invalid edges (e.g., vertex out of bounds) prompt re-entry.
- Distance will be reported as `Integer.MIN_VALUE` if the vertex is unreachable.

---

## 🧠 BFS Algorithm Summary

The BFS traversal uses the following logic:

- Initialize a queue and visited list.
- Enqueue the start node, mark it visited, set its distance to `0`.
- Dequeue nodes, explore neighbors, and enqueue unvisited ones.
- For each neighbor, update distance as:  
  `distance[neighbor] = distance[current] + 1`

---

## 🧾 Output Example

```text
The BFS traversal is:
0 1 2 3 4

The result is: 2
```

---

## 📝 Author

**Priyam Bhattacharya**  
_M.Sc. Computer Science, University of Calcutta_

---

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT) — you are free to use, modify, and distribute it with attribution.

---

## 📬 Feedback

For feedback, suggestions, or academic discussion, please feel free to connect with me via [LinkedIn](https://www.linkedin.com/in/itspriyambhattacharya) or Email at `itspriyambhattacharya@gmail.com`.
