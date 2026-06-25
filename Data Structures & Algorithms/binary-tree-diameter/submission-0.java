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
    // Biến toàn cục để lưu trữ đường kính lớn nhất tìm được
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        // Gọi hàm đệ quy để duyệt cây
        calculateDepth(root);
        return maxDiameter;
    }

    // Hàm phụ trợ tính chiều cao của một nhánh và cập nhật đường kính
    private int calculateDepth(TreeNode node) {
        // Điều kiện dừng: Nếu node rỗng, chiều cao bằng 0
        if (node == null) {
            return 0;
        }

        // Đệ quy tính chiều cao của nhánh con bên trái và bên phải
        int leftDepth = calculateDepth(node.left);
        int rightDepth = calculateDepth(node.right);

        // Cập nhật đường kính lớn nhất: 
        // Đường kính đi qua node hiện tại = chiều cao nhánh trái + chiều cao nhánh phải
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        // Trả về chiều cao của nhánh tính từ node hiện tại
        // Bằng nhánh con dài nhất + 1 (cộng 1 là cộng chính node hiện tại)
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
