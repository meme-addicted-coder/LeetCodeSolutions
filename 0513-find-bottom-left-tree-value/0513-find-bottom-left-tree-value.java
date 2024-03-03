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
 //1st appr:normal bfs, queue size cal...
 //2nd root,right,left bfs  //both has same complexity 0(N)
 //3rd DFS+recursion
class Solution { 
    int maxDepth=-1;
    int ans=-1;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    public void dfs(TreeNode root,int depth)
    {
        if(root==null){
            return;
        }
        if(depth>maxDepth){
            maxDepth=depth;
            ans=root.val;
        }
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
}