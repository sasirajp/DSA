package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSLevelWisePrint {

    static void bfsTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.poll();
                System.out.print(currNode.val + " ");

                if (currNode.left != null) queue.add(currNode.left);
                if (currNode.right != null) queue.add(currNode.right);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

    }
}
