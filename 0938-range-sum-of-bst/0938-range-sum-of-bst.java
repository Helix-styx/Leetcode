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
    public int sumT(TreeNode Node,int low, int high){

        if(Node.val>=low && Node.val<=high) return Node.val;
        return 0;
    }
    int sum =0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root!=null){
            sum+=sumT(root,low,high);
            rangeSumBST(root.left,low,high);
            rangeSumBST(root.right,low,high);
        }
        return sum;
    }
}