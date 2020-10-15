package linkedlist;

import common.ListNode;

/**
 * @ClassName DeleteNode
 * @Description 删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
 * @Author 中森明菜
 * @Date 2020/10/14 16:59
 * @Version 1.0
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
