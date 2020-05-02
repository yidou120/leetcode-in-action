/**
 * @ClassName GetIntersectionNode
 * @Description 两个链表的第一个公共节点
 * @Author 中森明菜
 * @Date 2020/5/2 12:04
 * @Version 1.0
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA,p2=headB;
        while(p1!=p2){
            p1 = p1==null ? headB:p1.next;
            p2 = p2==null ? headA:p2.next;
        }
        return p1;
    }
}
