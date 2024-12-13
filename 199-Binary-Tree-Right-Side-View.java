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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)
        {
            return ans;
        }
        q.add(root);
        while(q.size() > 0){
            int n = q.size();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i = 0;i< n;i++){
                TreeNode temp = q.remove();
                al.add(temp.val);
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            ans.add(al.get(al.size() -1 ));
        }
        return ans;
    }
}