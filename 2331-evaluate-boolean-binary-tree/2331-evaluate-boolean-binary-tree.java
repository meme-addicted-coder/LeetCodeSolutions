/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        if (root.left == null && root.right == null) {
            if (root.val == 0) {
                return false;
            } else if (root.val == 1) {
                return true;
            }
        }
        
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        
        if (root.val == 2) {
            return left || right;
        } else if (root.val == 3) {
            return left && right;
        }
        
        return true;
    }
}