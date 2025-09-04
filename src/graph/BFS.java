package graph;

import java.util.*;

public class BFS {

    static void bfsTraversal(GraphNode startNode) {
        if (startNode == null) return;
        Set<GraphNode> visitedNodes = new HashSet<>();
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(startNode);
        visitedNodes.add(startNode);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.poll();
            System.out.println(currentNode.val);

            for (GraphNode node: currentNode.graphNodes) {
                if (!visitedNodes.contains(node)) {
                    visitedNodes.add(node);
                    queue.add(node);
                }
            }
        }
    }

    static void bfsLevelOrderTraversal(GraphNode startNode) {
        if (startNode == null) return;
        Queue<GraphNode> queue = new LinkedList<>();
        Set<GraphNode> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                GraphNode currNode = queue.poll();
                System.out.print(currNode.val + " ");
                for (GraphNode node: currNode.graphNodes) {
                    if (!visited.contains(node)) {
                        visited.add(node);
                        queue.add(node);
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        GraphNode graphNode = new GraphNode(1);
        GraphNode graphNode2 = new GraphNode(2);
        GraphNode graphNode3 = new GraphNode(3);
        GraphNode graphNode4 = new GraphNode(4);
        GraphNode graphNode5 = new GraphNode(5);
        GraphNode graphNode6 = new GraphNode(6);
        GraphNode graphNode7 = new GraphNode(7);


        graphNode.graphNodes.addAll(Arrays.asList(graphNode2, graphNode3));
        graphNode2.graphNodes.addAll(Arrays.asList(graphNode));
        graphNode3.graphNodes.addAll(Arrays.asList(graphNode, graphNode4, graphNode5));
        graphNode4.graphNodes.addAll(Arrays.asList(graphNode3, graphNode7, graphNode6));
        graphNode5.graphNodes.addAll(Arrays.asList(graphNode3, graphNode6));
        graphNode7.graphNodes.add(graphNode4);
        graphNode6.graphNodes.addAll(Arrays.asList(graphNode4, graphNode5));

//        bfsTraversal(graphNode);
        bfsLevelOrderTraversal(graphNode);
    }
}
