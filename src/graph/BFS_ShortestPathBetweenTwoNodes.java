package graph;

import java.util.*;


public class BFS_ShortestPathBetweenTwoNodes {

    static List<GraphNode> getShortestPath(GraphNode startNode, GraphNode endNode) {
        if (startNode == null || endNode == null) return null;
        Queue<GraphNode> queue = new LinkedList<>();
        Set<GraphNode> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);
        HashMap<GraphNode, GraphNode> parentMap = new HashMap<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                GraphNode currentNode = queue.poll();
                for (GraphNode node: currentNode.graphNodes) {
                    if (!visited.contains(node)) {
                        visited.add(node);
                        queue.add(node);
                        parentMap.put(node, currentNode);
                    }
                }
            }
        }

        List<GraphNode> list = new ArrayList<>();
        GraphNode currentNode = endNode;
        for (Map.Entry<GraphNode, GraphNode> entry: parentMap.entrySet()) {
            while (currentNode != startNode) {
                list.add(currentNode);
                currentNode = parentMap.get(currentNode);
            }
        }
        list.add(startNode);

        return list;
    }


    public static void main(String[] args) {

        GraphNode graphNode = new GraphNode(1);
        GraphNode graphNode2 = new GraphNode(2);
        GraphNode graphNode3 = new GraphNode(3);
        GraphNode graphNode4 = new GraphNode(4);
        GraphNode graphNode5 = new GraphNode(5);
        GraphNode graphNode6 = new GraphNode(6);
        GraphNode graphNode7 = new GraphNode(7);
        GraphNode graphNode8 = new GraphNode(8);
        GraphNode graphNode9 = new GraphNode(9);
        GraphNode graphNode10 = new GraphNode(10);

        graphNode.graphNodes.addAll(Arrays.asList(graphNode2, graphNode3));
        graphNode2.graphNodes.add(graphNode);
        graphNode3.graphNodes.addAll(Arrays.asList(graphNode, graphNode4, graphNode5));
        graphNode4.graphNodes.addAll(Arrays.asList(graphNode3, graphNode7, graphNode6));
        graphNode5.graphNodes.addAll(Arrays.asList(graphNode3, graphNode6));
        graphNode7.graphNodes.add(graphNode4);
        graphNode6.graphNodes.addAll(Arrays.asList(graphNode4, graphNode5, graphNode8, graphNode9, graphNode10));
        graphNode8.graphNodes.add(graphNode6);
        graphNode9.graphNodes.add(graphNode6);
        graphNode10.graphNodes.add(graphNode6);

        var res = getShortestPath(graphNode5, graphNode8);
        System.out.println(res.reversed());
    }
}
