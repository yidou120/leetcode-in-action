import java.util.Stack;

/**
 * @ClassName ReverseList
 * @Description 24.反转链表
 * @Author 中森明菜
 * @Date 2020/4/24 19:48
 * @Version 1.0
 */
/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
public class ReverseList {
    //1.使用栈先将链表遍历的值存入，再遍历链表，更改每个结点的值
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while(cur!=null){
            stack.push(cur.val);
            cur = cur.next;
        }
        cur = head;
        while(cur!=null){
            cur.val = stack.pop();
            cur = cur.next;
        }
        return head;
    }
    //2.使用双指针
    public ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while(cur!=null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
    //3.使用递归
    public ListNode reverseList3(ListNode head) {
        while(head == null || head.next==null){
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
