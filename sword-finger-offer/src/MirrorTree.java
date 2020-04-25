import java.util.Stack;

/**
 * @ClassName MirrorTree
 * @Description 二叉树的镜像
 * @Author 中森明菜
 * @Date 2020/4/25 11:23
 * @Version 1.0
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class MirrorTree {
    //1.使用辅助栈
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left!=null) stack.add(node.left);
            if(node.right!=null) stack.add(node.right);
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }
}
