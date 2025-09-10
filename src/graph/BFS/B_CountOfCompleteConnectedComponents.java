package graph.BFS;

import java.util.*;

public class B_CountOfCompleteConnectedComponents {
    public static void getComponents(int V, int[][] edges) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        int completedComponentCount = 0;
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i =0; i < edges.length; i++) {
            int row = edges[i][0];
            int col = edges[i][1];
            graph.get(row).add(col);
            graph.get(col).add(row);
        }
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfs(visited, i, graph)) completedComponentCount++;
            }
        }
        System.out.println(completedComponentCount);

    }

    private static boolean bfs(boolean[] visited, int i, Map<Integer, ArrayList<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i] = true;
        int edges = 0;
        int vertices = 0;
        while (!queue.isEmpty()) {
            vertices++;
            int currentVal = queue.poll();
            for (int val: graph.get(currentVal)) {
                edges++;
                if (!visited[val]) {
                    visited[val] = true;
                    queue.add(val);
                }
            }
        }
        return checkForComplete(vertices, edges/2);
    }

    private static boolean checkForComplete(int vertices, int edges) {
//        E = (V * (V - 1)) / 2

        return edges == ((vertices) * (vertices - 1) / 2);
    }


    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{1,2},{3,4}};
        int V = 6;
        getComponents(V, edges);
    }
}
