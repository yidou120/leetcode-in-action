package common;

/**
 * @ClassName TreeNode
 * @Description TODO
 * @Author 中森明菜
 * @Date 2020/10/30 22:12
 * @Version 1.0
 */
public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

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
