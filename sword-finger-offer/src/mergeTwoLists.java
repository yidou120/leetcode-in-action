/**
 * @ClassName mergeTwoLists
 * @Description 合并两个排序的链表
 * @Author 中森明菜
 * @Date 2020/4/24 20:49
 * @Version 1.0
 */
public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0),cur = node;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1!=null ? l1:l2;
        return node.next;
    }
}
