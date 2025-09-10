package graph.BFS;

import java.util.*;

public class G_CycleDetectionInUndirectedGraph {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph4 = new HashMap<>();
        graph4.put(0, Arrays.asList(1));
        graph4.put(1, Arrays.asList(0));
        graph4.put(2, Arrays.asList(3));
        graph4.put(3, Arrays.asList(2));
        System.out.println(bfs(graph4));

    }

    static boolean bfs(Map<Integer, List<Integer>> graph) {

        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        queue.add(1);
        visited.add(1);
        map.put(1, -1);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int parent = map.get(current);
            for (int neighbour: graph.get(current)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                    map.put(neighbour, current);
                } else if (visited.contains(neighbour) && neighbour != parent) {
                    return true;
                }
            }

        }

        return false;
    }
}
