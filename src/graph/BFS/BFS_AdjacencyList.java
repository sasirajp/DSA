package graph.BFS;

import graph.GraphNode;

import java.util.*;

public class BFS_AdjacencyList {


    static void bfsTraversal(GraphNode startNode) {

        if (startNode == null) return;
        Queue<GraphNode> queue = new LinkedList<>();
        Set<GraphNode> visitedNodes = new HashSet<>();

        queue.add(startNode);
        visitedNodes.add(startNode);

        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.poll();
            System.out.println(currentNode.val);

            for (GraphNode node: currentNode.graphNodes) {
                if (visitedNodes.contains(node)) {
                    queue.add(node);
                    visitedNodes.add(node);
                }
            }
        }

    }

    static void bfsLevelOrderTraversal(GraphNode startNode) {
        if (startNode == null) return;
        Queue<GraphNode> queue = new LinkedList<>();
        Set<GraphNode> visted = new HashSet<>();
        queue.add(startNode);
        visted.add(startNode);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                GraphNode currentNode = queue.poll();
                System.out.print(currentNode.val + " ");

                for (GraphNode node: currentNode.graphNodes) {
                    if (!visted.contains(node)) {
                        queue.add(node);
                        visted.add(node);
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
        GraphNode graphNode8 = new GraphNode(8);
        GraphNode graphNode9 = new GraphNode(9);
        GraphNode graphNode10 = new GraphNode(10);

        graphNode.graphNodes.addAll(Arrays.asList(graphNode2, graphNode3));
        graphNode2.graphNodes.addAll(Arrays.asList(graphNode));
        graphNode3.graphNodes.addAll(Arrays.asList(graphNode, graphNode4, graphNode5));
        graphNode4.graphNodes.addAll(Arrays.asList(graphNode3, graphNode7, graphNode6));
        graphNode5.graphNodes.addAll(Arrays.asList(graphNode3, graphNode6));
        graphNode7.graphNodes.add(graphNode4);
        graphNode6.graphNodes.addAll(Arrays.asList(graphNode4, graphNode5, graphNode8, graphNode9, graphNode10));
        graphNode8.graphNodes.add(graphNode6);
        graphNode9.graphNodes.add(graphNode6);
        graphNode10.graphNodes.add(graphNode6);

        bfsTraversal(graphNode);
        System.out.println("------------------------------------");
        bfsLevelOrderTraversal(graphNode5);
    }
}
