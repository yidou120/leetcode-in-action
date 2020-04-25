/**
 * @ClassName IsSymmetricTree
 * @Description 对称二叉树
 * @Author 中森明菜
 * @Date 2020/4/25 12:54
 * @Version 1.0
 */
public class IsSymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root==null?true:recur(root.left,root.right);
    }
    public static boolean recur(TreeNode n1,TreeNode n2){
        if(n1==null&n2==null) return true;
        if(n1==null || n2==null || n1.val!=n2.val) return false;
        return recur(n1.left,n2.right) && recur(n1.right,n2.left);
    }
}
