import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelOrder
 * @Description 从上到下打印二叉树
 * @Author 中森明菜
 * @Date 2020/4/26 22:12
 * @Version 1.0
 */
public class LevelOrder {
    public int[] levelOrder(TreeNode root) {
        if(root==null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<Integer>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i).intValue();
        }
        return result;
    }
}
