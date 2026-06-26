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
    private int getHeight(TreeNode root){
        if(root == null){
            return -1;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight , rightHeight) +1;

    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        boolean isCurrentBalanced = Math.abs(leftHeight - rightHeight) <= 1;
        return isCurrentBalanced && isBalanced(root.left) && isBalanced(root.right);
    }
}
