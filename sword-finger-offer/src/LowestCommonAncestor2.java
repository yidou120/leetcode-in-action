/**
 * @ClassName LowestCommonAncestor2
 * @Description 二叉树的最近公共祖先
 * @Author 中森明菜
 * @Date 2020/4/30 11:43
 * @Version 1.0
 */
public class LowestCommonAncestor2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left==null) return right;
        if(right==null) return left;
        return root;
    }
}
