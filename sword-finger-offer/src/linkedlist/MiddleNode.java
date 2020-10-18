package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName MiddleNode
 * @Description 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * @Author 中森明菜
 * @Date 2020/10/18 12:38
 * @Version 1.0
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        List<ListNode> listNodes = new ArrayList<>();
        ListNode currentNode = head;
        while (Objects.nonNull(currentNode)) {
            listNodes.add(currentNode);
            currentNode = currentNode.next;
        }
        int size = listNodes.size();
        return listNodes.get(size/2);
    }
}
