package BST;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Richard Phoenix
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class _226_Invert_Binary_Tree {

    // Using Queue
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return root;
    }





//    // Using recursion
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return root;
//
//        TreeNode tmp = root.left;
//        root.left = root.right;
//        root.right = tmp;
//
//        invertTree(root.left);
//        invertTree(root.right);
//
//        return root;
//    }
}
