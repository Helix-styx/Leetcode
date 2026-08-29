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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        q.offer(root);
        int lvl = 0;
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int x = q.size();
            
            for(int i=1; i<=x; i++){
                TreeNode temp = q.poll();
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                level.add(temp.val);
            }
            if(lvl%2==0)
            ans.add(level);
            else{
                Collections.reverse(level);
                ans.add(level);
            } 
            lvl++;
        }
        return ans;
    }
}