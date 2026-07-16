// Last updated: 7/16/2026, 7:59:12 PM
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }
    private void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);      
        preorder(root.left, result) ;
        preorder(root.right, result); 
    }
}