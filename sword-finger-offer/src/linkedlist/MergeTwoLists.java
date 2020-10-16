package linkedlist;


import java.util.Objects;

/**
 * @ClassName MergeTwoLists
 * @Description 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @Author 中森明菜
 * @Date 2020/10/15 8:38
 * @Version 1.0
 */

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // l1 开始比较 l2
        // 如果l1.val>=l2.val l2.next = l1
        // l1.val < l2.val l1.next = l2
        // l1=null&&l2=null
        // 1,2,3 1,3,4,5,
        if(Objects.isNull(l1)){
            return l2;
        }else if(Objects.isNull(l2)){
            return l1;
        }else if(l1.val > l2.val) {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }else {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}