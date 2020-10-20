package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName IsPalindrome
 * @Description 请判断一个链表是否为回文链表
 * @Author 中森明菜
 * @Date 2020/10/17 22:32
 * @Version 1.0
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode currentNode = head;
        while (Objects.nonNull(currentNode)) {
            list.add(currentNode.val);
            currentNode = currentNode.next;
        }
        int pre = 0;
        int end = list.size() - 1;
        while (pre < end) {
            if (!list.get(pre).equals(list.get(end))){
                return false;
            }
            pre++;
            end--;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        if(Objects.isNull(head)||Objects.isNull(head.next)){
            return true;
        }
        // 找出中间结点
        ListNode middle = middleNode(head);
        // 反转第二部分的结点
        ListNode last = reverseLinked(middle.next);
        // 比较是否相等
        while(last!=null){
            if(last.val != head.val){
                return false;
            }
            head = head.next;
            last = last.next;
        }

        return true;
    }
    ListNode middleNode(ListNode head){
        // 快慢指针
        ListNode low = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }
    ListNode reverseLinked(ListNode node){
        // 伪头
        ListNode pre = null;
        ListNode cur = node;
        while(cur!=null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
