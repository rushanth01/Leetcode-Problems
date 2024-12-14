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
    public int findBottomLeftValue(TreeNode root) {
       List<Integer> rs=new ArrayList<>();
        if(root==null){
            return 0;
        }
      Queue <TreeNode> q1=new LinkedList<>();
      q1.add(root);
      while(!q1.isEmpty()){
        int levelsize=q1.size();
        for(int i=0;i<levelsize;i++){
            TreeNode node=q1.poll();
            if (i == 0) {
                rs.add(node.val); 
            }
            if(node.left!=null){
                q1.add(node.left);
            }
            if(node.right!=null){
                q1.add(node.right);
            }
            
        }
      }
      return rs.get(rs.size()-1);
    }
}