package string;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GetDecimalValue
 * @Description 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。请你返回该链表所表示数字的 十进制值 。
 * @Author 中森明菜
 * @Date 2020/10/20 19:28
 * @Version 1.0
 */
public class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int result = 0;
        int j = 0;
        for(int i=list.size()-1;i>=0;i--){
            result += list.get(i) * Math.pow(2,j);
            j++;
        }
        return result;
    }
}
