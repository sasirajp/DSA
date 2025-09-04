package tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    static void bfsTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.val + " ");
            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add(currentNode.right);
        }

    }

    public static void main(String[] args) {

    }
}
