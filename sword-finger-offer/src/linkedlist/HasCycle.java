package linkedlist;

/**
 * @ClassName HasCycle
 * @Description 给定一个链表，判断链表中是否有环。
 * @Author 中森明菜
 * @Date 2020/10/26 19:23
 * @Version 1.0
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow!=fast){
            if(fast==null||fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
