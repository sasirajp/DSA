package graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class E_RottingOranges {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0)
            return -1;
        if (n == 1 && grid[0][0] == 0) {
            return 1;
        }
        int shortestPath = 0;
        Queue<int[]> queue = new LinkedList<>();
        int[][] direction = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 } };
        queue.add(new int[] { 0, 0 });
        grid[0][0] = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            shortestPath++;
            while (size-- > 0) {
                int[] currentCell = queue.poll();
                for (int k = 0; k < 8; k++) {
                    int nr = currentCell[0] + direction[k][0];
                    int nc = currentCell[1] + direction[k][1];
                    if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 0) {
                        grid[nr][nc] = -1;
                        queue.add(new int[] { nr, nc });
                        if (nr == nc && nc == n - 1) return shortestPath + 1;
                    }
                }
            }
        }
        return -1;
    }
}
