package linkedlist;

/**
 * @ClassName ReverseList
 * @Description 反转一个单链表
 * @Author 中森明菜
 * @Date 2020/10/20 18:38
 * @Version 1.0
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
