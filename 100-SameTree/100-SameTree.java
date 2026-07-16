// Last updated: 7/16/2026, 7:59:45 PM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}