package linkedlist;

/**
 * @ClassName GetIntersectionNode
 * @Description 链表相交
 * @Author 中森明菜
 * @Date 2020/10/25 21:47
 * @Version 1.0
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        while(l1!=l2){
            l1 = l1 != null ? l1.next : headB;
            l2 = l2 != null ? l2.next : headA;
        }
        return l1;
    }
}
