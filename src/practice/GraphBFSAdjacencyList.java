package practice;

import java.util.*;

public class GraphBFSAdjacencyList {


    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = Map.of(
                1, List.of(2, 3),
                2, List.of(1),
                3, List.of(1, 4, 5),
                4, List.of(3, 7, 6),
                5, List.of(3, 6),
                6, List.of(4, 5, 8, 9, 10),
                7, List.of(4),
                8, List.of(6),
                9, List.of(6),
                10, List.of(6)
        );

        bfsAdjacencyList(graph, 5);

    }

    private static void bfsAdjacencyList(Map<Integer, List<Integer>> graph, int start) {

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Integer current = queue.poll();
                System.out.print(current + " ");
                for (Integer data: graph.get(current)) {
                    if (!visited.contains(data)) {
                        visited.add(data);
                        queue.add(data);
                    }
                }
            }
            System.out.println();
        }

    }
}
