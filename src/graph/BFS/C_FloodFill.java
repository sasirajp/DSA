package graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class C_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(color == image[sr][sc]) return image;
        Queue<int[]> queue = new LinkedList<>();
        int m = image.length;
        int n = image[0].length;

        queue.add(new int[]{sr,sc});
        int initialColour = image[sr][sc];
        image[sr][sc] = color;
        int[][] directions = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};
        while(!queue.isEmpty()) {
            int[] currentVal = queue.poll();
            for(int j = 0; j < 4; j++) {
                int r = currentVal[0] + directions[j][0];
                int c = currentVal[1] + directions[j][1];
                if (r >=0 && r < m && c < n && c >= 0 && image[r][c] == initialColour) {  // image[r][c] == initialColour is marking as visited as well
                    queue.add(new int[]{r, c});
                    image[r][c] = color;
                }
            }
        }
        return image;
    }
}
