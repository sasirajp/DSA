package graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class A1_NumberOfIslands {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int numerOfIslands = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    numerOfIslands++;
                    bfs(i, j, directions, grid, rows, cols);
                }
            }
        }
        return numerOfIslands;
    }

    void bfs(int i, int j, int[][] directions, char[][] grid, int rows, int cols) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        grid[i][j] = '*';
        while(!queue.isEmpty()) {
            int[] currentValue = queue.poll();
            for(int k = 0; k < 4; k++) {
                int nr = currentValue[0] + directions[k][0];
                int nc = currentValue[1] + directions[k][1];
                if (nr >=0 && nr < rows && nc >=0 && nc < cols && grid[nr][nc] == '1') {
                    queue.add(new int[]{nr ,nc});
                    grid[nr][nc] = '*';
                }
            }
        }
    }
}
