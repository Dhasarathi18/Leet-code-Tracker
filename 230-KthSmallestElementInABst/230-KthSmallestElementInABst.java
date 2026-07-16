// Last updated: 7/16/2026, 7:58:21 PM
class Solution {
    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return ans;
    }
    void inorder(TreeNode node, int k) {
        if (node == null) return;
        inorder(node.left, k);
        count++;
        if (count == k) {
            ans = node.val;
            return;
        }
        inorder(node.right, k);
    }
}