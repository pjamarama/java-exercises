public class ValidateBinaryTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, root.left.val, root.right.val);
    }

    private boolean isValid(TreeNode node, int left, int right) {
        if (node == null) {
            return true;
        }

        if ((left > node.val) && (right < node.val)) {
            return false;
        }

        return (isValid(node.left, Integer.MIN_VALUE, node.val) && isValid(node.right, node.val, Integer.MAX_VALUE));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}