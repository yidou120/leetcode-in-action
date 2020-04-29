/**
 * @ClassName lowestCommonAncestor
 * @Description  I. 二叉搜索树的最近公共祖先
 * @Author 中森明菜
 * @Date 2020/4/29 12:51
 * @Version 1.0
 */
public class LowestCommonAncestor {
    //1.使用递归
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root.val>p.val && root.val>q.val){
            return lowestCommonAncestor(root.left,p,q); //在左
        }else if(root.val<p.val && root.val<q.val){
            return lowestCommonAncestor(root.right,p,q); //左右结点在右
        }else {
            return root;
        }
    }
    //2.使用迭代
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if(root.val > p.val && root.val > q.val){
                root = root.left; //p q在左边
            }else if(root.val < p.val && root.val < q.val){
                root = root.right; //p q在右边
            }else break;
        }
        return root;
    }
}
