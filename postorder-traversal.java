import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    private void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Recursively traverse the left subtree
        postorderHelper(node.left, result);

        // Recursively traverse the right subtree
        postorderHelper(node.right, result);

        // Visit the root node (after both left and right subtrees)
        result.add(node.val);
    }

    // Example usage
    public static void main(String[] args) {
        // Creating a sample binary tree:
        //      1
        //       \
        //        2
        //       /
        //      3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution solution = new Solution();
        List<Integer> result = solution.postorderTraversal(root);

        // Print the postorder traversal result
        System.out.println("Postorder traversal: " + result);
    }
}

