package tree;

import common.Node;

import java.util.*;

/**
 * @ClassName Solution
 * @Description 给定一个 N 叉树，返回其节点值的前序遍历。
 * @Author 中森明菜
 * @Date 2020/11/4 14:22
 * @Version 1.0
 */
public class Solution {
    List<Integer> out = new ArrayList<>();

    // 递归
    public List<Integer> preorder(Node root) {
        dfs(root);
        return out;
    }

    public void dfs(Node node) {
        if (Objects.isNull(node)) {
            return;
        }
        out.add(node.val);
        if (Objects.isNull(node.children)) {
            return;
        }
        for (Node n : node.children) {
            dfs(n);
        }
    }

    // 迭代
    public List<Integer> preorder2(Node root) {
        // 栈
        List<Node> stack = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if (Objects.isNull(root)) {
            return list;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = ((LinkedList<Node>) stack).pollLast();
            list.add(node.val);
            if (Objects.isNull(node.children)) {
                continue;
            }
            Collections.reverse(node.children);
            for (Node n : node.children){
                stack.add(n);
            }
        }
        return list;
    }
}
