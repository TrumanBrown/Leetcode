/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private boolean isBSTHelper(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        else if (min !=null && node.val <= min || max!=null && node.val >= max) {
            return false;
        }
        return isBSTHelper(node.left, min, node.val) && isBSTHelper(node.right, node.val, max);
    }
    public boolean isValidBST(TreeNode root) {
        return isBSTHelper(root, null, null);
    }
   
}
