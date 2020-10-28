package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName RemoveDuplicateNodes
 * @Description 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点
 * @Author 中森明菜
 * @Date 2020/10/27 9:53
 * @Version 1.0
 */
public class RemoveDuplicateNodes {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null){
            return head;
        }
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode pre = head;
        while(pre.next!=null){
            ListNode cur = pre.next;
            if(!set.add(cur.val)){
                pre.next = cur.next;
            }else{
                pre = pre.next;
            }
        }
        return head;
    }
}
