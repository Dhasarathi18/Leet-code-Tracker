// Last updated: 7/16/2026, 7:59:42 PM
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }
    public boolean mirror(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;
        if (a == null || b == null)
            return false;
        if (a.val != b.val)
            return false;
        return mirror(a.left, b.right) &&
               mirror(a.right, b.left);
    }
}