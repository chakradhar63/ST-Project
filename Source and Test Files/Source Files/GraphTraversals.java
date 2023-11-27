package org.example;
import java.util.*;
public class GraphTraversals
{
    // Function to add an edge to the graph
    private static void addEdge(List<List<Integer>> graph, int src, int dest) {
        graph.get(src).add(dest);
    }

    // Function to perform different traversals
    public static List<List<Integer>> performTraversals(List<int[]> edges, int vertices, int start) {
        List<List<Integer>> graph = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            addEdge(graph, edge[0], edge[1]);
        }

        List<List<Integer>> traversals = new ArrayList<>();

        traversals.add(bfsTraversal(graph, vertices, start));
        traversals.add(dfsTraversal(graph, vertices, start));
        traversals.add(topologicalSort(graph, vertices));

        return traversals;
    }

    // Breadth-First Search (BFS) Traversal
    private static List<Integer> bfsTraversal(List<List<Integer>> graph, int vertices, int start) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            result.add(current);

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        return result;
    }

    // Depth-First Search (DFS) Traversal
    private static List<Integer> dfsTraversal(List<List<Integer>> graph, int vertices, int start) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[vertices];
        dfsHelper(graph, start, visited, result);
        return result;
    }

    private static void dfsHelper(List<List<Integer>> graph, int current, boolean[] visited, List<Integer> result) {
        visited[current] = true;
        result.add(current);

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                dfsHelper(graph, neighbor, visited, result);
            }
        }
    }

    // Topological Sort (for Directed Acyclic Graphs)
    private static List<Integer> topologicalSort(List<List<Integer>> graph, int vertices) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                topologicalSortHelper(graph, i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    private static void topologicalSortHelper(List<List<Integer>> graph, int current, boolean[] visited, Stack<Integer> stack) {
        visited[current] = true;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                topologicalSortHelper(graph, neighbor, visited, stack);
            }
        }

        stack.push(current);
    }
}

