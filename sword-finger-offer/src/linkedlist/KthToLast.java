package linkedlist;

import common.ListNode;

/**
 * @ClassName KthToLast
 * @Description 返回倒数第 k 个节点
 * @Author 中森明菜
 * @Date 2020/10/14 16:45
 * @Version 1.0
 */
public class KthToLast {
    public int kthToLast(ListNode head, int k) {
        ListNode node = head;
        for (int i=0;i<k;i++){
            node = node.next;
        }
        while (node != null) {
            node = node.next;
            head = head.next;
        }
        return head.val;
    }
}


