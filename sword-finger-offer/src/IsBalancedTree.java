/**
 * @ClassName IsBalancedTree
 * @Description 平衡二叉树
 * @Author 中森明菜
 * @Date 2020/5/1 14:42
 * @Version 1.0
 */
public class IsBalancedTree {
    public boolean isBalanced(TreeNode root) {
        return recur(root)==-1?false:true;
    }
    //后序遍历 左/右/根
    private int recur(TreeNode root){
        if(root==null) return 0;
        int left = recur(root.left);
        if(left==-1) return -1;
        int right = recur(root.right);
        if(right==-1) return -1;
        return Math.abs(left-right) < 2 ? Math.max(left,right)+1 : -1;
    }
}
