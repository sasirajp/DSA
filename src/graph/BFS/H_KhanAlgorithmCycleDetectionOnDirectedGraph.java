package graph.BFS;

import java.util.*;

public class H_KhanAlgorithmCycleDetectionOnDirectedGraph {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = Map.of(
                0, List.of(),
                1, List.of(),
                2, List.of(3),
                3, List.of(1),
                4, List.of(0, 1),
                5, List.of(0, 2)
        );
        cyclePresent(graph, 6);

        Map<Integer, List<Integer>> graph2 = Map.of(
                0, List.of(4),
                1, List.of(3),
                2, List.of(3),
                3, List.of(0),
                4, List.of(1),
                5, List.of(0, 2)
        );
        cyclePresent(graph2, 6);
    }

    static void cyclePresent(Map<Integer, List<Integer>> graph, int V) {
        int[] inDegree = new int[6];
        int processedNodesCount = 0;
        for (Map.Entry<Integer, List<Integer>> entry: graph.entrySet()) {
            for (int dep: entry.getValue()) {
                inDegree[dep]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            processedNodesCount++;
            int val = queue.poll();
            list.add(val);
            for (int dependentVal: graph.get(val)) {
                inDegree[dependentVal]--;
                if (inDegree[dependentVal] == 0) queue.add(dependentVal);
            }
        }

        System.out.println(list);
        System.out.println(processedNodesCount == V);
    }
}
