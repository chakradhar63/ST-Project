package org.example;
import java.util.*;

public class TreeTraversals {
    // Function to add an edge to the tree
    private static void addEdge(List<List<Integer>> tree, int parent, int child) {
        tree.get(parent).add(child);
    }

    // Function to perform different tree traversals
    public static List<List<Integer>> performTraversals(List<int[]> edges, int vertices, int root) {
        List<List<Integer>> tree = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            tree.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            addEdge(tree, edge[0], edge[1]);
        }

        List<List<Integer>> traversals = new ArrayList<>();

        traversals.add(inorderTraversal(tree, root));
        traversals.add(preorderTraversal(tree, root));
        traversals.add(postorderTraversal(tree, root));

        return traversals;
    }

    // Inorder Traversal
    private static List<Integer> inorderTraversal(List<List<Integer>> tree, int root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(tree, root, result);
        return result;
    }

    private static void inorderHelper(List<List<Integer>> tree, int current, List<Integer> result) {
        if (current != -1) {
            if (tree.get(current).size() > 0) {
                inorderHelper(tree, tree.get(current).get(0), result);
            }
            result.add(current);
            if (tree.get(current).size() > 1) {
                inorderHelper(tree, tree.get(current).get(1), result);
            }
        }
    }

    // Preorder Traversal
    private static List<Integer> preorderTraversal(List<List<Integer>> tree, int root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(tree, root, result);
        return result;
    }

    private static void preorderHelper(List<List<Integer>> tree, int current, List<Integer> result) {
        if (current != -1) {
            result.add(current);
            if (tree.get(current).size() > 0) {
                preorderHelper(tree, tree.get(current).get(0), result);
            }
            if (tree.get(current).size() > 1) {
                preorderHelper(tree, tree.get(current).get(1), result);
            }
        }
    }

    // Postorder Traversal
    private static List<Integer> postorderTraversal(List<List<Integer>> tree, int root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(tree, root, result);
        return result;
    }

    private static void postorderHelper(List<List<Integer>> tree, int current, List<Integer> result) {
        if (current != -1) {
            if (tree.get(current).size() > 0) {
                postorderHelper(tree, tree.get(current).get(0), result);
            }
            if (tree.get(current).size() > 1) {
                postorderHelper(tree, tree.get(current).get(1), result);
            }
            result.add(current);
        }
    }
}
