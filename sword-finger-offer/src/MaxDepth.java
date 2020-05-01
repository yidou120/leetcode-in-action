/**
 * @ClassName MaxDepth
 * @Description 二叉树的深度
 * @Author 中森明菜
 * @Date 2020/5/1 15:51
 * @Version 1.0
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return recur(root);
    }
    private int recur(TreeNode root){
        if(root==null) return 0;
        int left = recur(root.left);
        int right = recur(root.right);
        return Math.max(left,right)+1;
    }
}
