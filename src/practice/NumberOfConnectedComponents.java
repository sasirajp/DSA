package practice;

import java.util.*;

public class NumberOfConnectedComponents {
    public static void getComponents(int V, int[][] edges) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            graph.put(i, new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++) {
            int row = edges[i][0];
            int col = edges[i][1];
            graph.get(row).add(col);
            graph.get(col).add(row);
        }
        System.out.println(graph);


        int count = 0;
        for(int i = 0; i < V; i++) {
            if(visited[i]) continue;
            count++;
            bfs(visited, i, graph);
        }

        System.out.println(count);
    }

    static void bfs(boolean[] visited, int i, Map<Integer, List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i] = true;
        while(!queue.isEmpty()) {
            int key = queue.poll();
            for(Integer val: graph.get(key)) {
                if(!visited[val]) {
                    queue.add(val);
                    visited[val] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {2, 1}, {3, 4}};
        int V = 5;
        getComponents(V, edges);
    }
}
