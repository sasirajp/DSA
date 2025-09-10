package graph.BFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_AdjacencyMatrix {

//                 0
//                / \
//               1   2
//              / \
//             3   4



    public static void main(String[] args) {

        int[][] graph = {
                {0,1,1,0,0},
                {0,0,0,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };


        bfsAdjacencyMatrix(graph, 0);

        System.out.println("------------------------------------");


        int[][] adjacencyMatrix = new int[10][10];

// 1 ↔ 2,3
        adjacencyMatrix[0][1] = 1; adjacencyMatrix[1][0] = 1;
        adjacencyMatrix[0][2] = 1; adjacencyMatrix[2][0] = 1;

// 3 ↔ 4,5
        adjacencyMatrix[2][3] = 1; adjacencyMatrix[3][2] = 1;
        adjacencyMatrix[2][4] = 1; adjacencyMatrix[4][2] = 1;

// 4 ↔ 7,6
        adjacencyMatrix[3][6] = 1; adjacencyMatrix[6][3] = 1;
        adjacencyMatrix[3][5] = 1; adjacencyMatrix[5][3] = 1;

// 5 ↔ 6
        adjacencyMatrix[4][5] = 1; adjacencyMatrix[5][4] = 1;

// 6 ↔ 8,9,10
        adjacencyMatrix[5][7] = 1; adjacencyMatrix[7][5] = 1;
        adjacencyMatrix[5][8] = 1; adjacencyMatrix[8][5] = 1;
        adjacencyMatrix[5][9] = 1; adjacencyMatrix[9][5] = 1;

        bfsAdjacencyMatrix(adjacencyMatrix, 4);


    }

    private static void bfsAdjacencyMatrix(int[][] graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            Integer current = queue.poll();
            System.out.print(current + " ");
            for (int j = 0; j < graph.length; j++) {
                if (graph[current][j] != 0 && !visited.contains(j)) {
                    visited.add(j);
                    queue.add(j);
                }
            }

        }
    }

    private static void bfsAdjacencyMatrixLevelOrder(int[][] graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Integer current = queue.poll();
                System.out.print(current + " ");
                for (int j = 0; j < graph.length; j++) {
                    if (graph[current][j]!=0 && !visited.contains(j)) {
                        visited.add(j);
                        queue.add(j);
                    }
                }
            }
            System.out.println();
        }
    }


}
