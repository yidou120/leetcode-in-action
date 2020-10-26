package linkedlist;

/**
 * @ClassName DeleteDuplicates
 * @Description 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * @Author 中森明菜
 * @Date 2020/10/25 22:17
 * @Version 1.0
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur!=null&&cur.next!=null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}
