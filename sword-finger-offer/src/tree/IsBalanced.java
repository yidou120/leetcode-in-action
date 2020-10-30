package tree;

import common.TreeNode;

/**
 * @ClassName IsBalanced
 * @Description 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * @Author 中森明菜
 * @Date 2020/10/30 22:11
 * @Version 1.0
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }
    public int getHeight(TreeNode node){
        if(node==null){
            return 0;
        }
        int left = getHeight(node.left);
        if(left==-1){
            return -1;
        }
        int right = getHeight(node.right);
        if(right==-1){
            return -1;
        }
        return Math.abs(left-right)<2 ? Math.max(left,right)+1:-1;
    }
}
