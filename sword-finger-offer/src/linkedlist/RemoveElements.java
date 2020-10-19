package linkedlist;

import java.security.AlgorithmConstraints;
import java.util.Currency;
import java.util.Objects;

/**
 * @ClassName RemoveElements
 * @Description 删除链表中等于给定值 val 的所有节点。
 * @Author 中森明菜
 * @Date 2020/10/18 13:20
 * @Version 1.0
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        //哨兵 伪头
        ListNode sentry = new ListNode(0);
        sentry.next = head;
        ListNode cur = head;
        ListNode pre = sentry;
        while (Objects.nonNull(cur)) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return sentry.next;
    }

    public ListNode removeElements2(ListNode head, int val) {
        //递归
        if (Objects.isNull(head)) {
            return null;
        }
        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        }
        return head;
    }
}
