package common;

import java.util.List;

/**
 * @ClassName Node
 * @Description TODO
 * @Author 中森明菜
 * @Date 2020/11/4 14:23
 * @Version 1.0
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
