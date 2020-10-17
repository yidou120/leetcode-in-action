package linkedlist;

import java.time.Period;
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
}
