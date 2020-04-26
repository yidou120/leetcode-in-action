import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName levelOrder2
 * @Description  从上到下打印二叉树 II
 * @Author 中森明菜
 * @Date 2020/4/26 22:59
 * @Version 1.0
 */
public class LevelOrder2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return new ArrayList<List<Integer>>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            list.add(temp);
        }
        return list;
    }
}
