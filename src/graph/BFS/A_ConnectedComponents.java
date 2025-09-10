package graph.BFS;

import java.util.*;

public class A_ConnectedComponents {
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
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            if(visited[i]) continue;
            count++;
            List<Integer> connectedComponent =  bfs(visited, i, graph);
            result.add(connectedComponent);
        }

        System.out.println(count);
        System.out.println(result);
    }

    static List<Integer> bfs(boolean[] visited, int i, Map<Integer, List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(i);
        visited[i] = true;
        while(!queue.isEmpty()) {
            int key = queue.poll();
            list.add(key);
            for(Integer val: graph.get(key)) {
                if(!visited[val]) {
                    queue.add(val);
                    visited[val] = true;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {6, 0}, {2, 4}, {2, 3}, {3, 4}};
        int V = 7;
        getComponents(V, edges);
    }
}
