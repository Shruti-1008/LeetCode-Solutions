class Solution {

    int ans = 0;

    public int longestUnivaluePath(TreeNode root) {
        path(root);
        return ans;
    }

    int path(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = path(root.left);
        int right = path(root.right);

        int leftPath = 0;
        int rightPath = 0;

        if (root.left != null && root.left.val == root.val) {
            leftPath = left + 1;
        }

        if (root.right != null && root.right.val == root.val) {
            rightPath = right + 1;
        }

        ans = Math.max(ans, leftPath + rightPath);

        return Math.max(leftPath, rightPath);
    }
}