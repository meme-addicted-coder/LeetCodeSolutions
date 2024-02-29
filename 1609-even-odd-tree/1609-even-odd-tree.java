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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return true;
        boolean even=true;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        

        while(!q.isEmpty())
        {
            int size=q.size();
            int prev=(even)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                int curr=node.val;
                //even val->odd and st incr
                //odd val->even and st decs
               if((even && (curr%2==0 || curr<=prev ))||(!even && (curr%2!=0 || curr>=prev)))
               {
                   return false;
               }
               prev=curr;
               if(node.left!=null)
               {
                   q.offer(node.left);
               }
               if(node.right!=null)
               {
                   q.offer(node.right);
               }
            }
            even= !even; //toggling levels
        }
        return true;
    }
}