package array;

import javax.swing.border.EtchedBorder;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static javax.swing.UIManager.get;
import static javax.swing.UIManager.put;

/**
 * @ClassName MajorityElement
 * @Description 找出主要元素
 * @Author 中森明菜
 * @Date 2020/10/11 18:33
 * @Version 1.0
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int len = nums.length / 2;
        // 现在数组的元素 都是数字 有重复的
        // 把重复的数字值作为key 出现的次数作为value
        // 只返回/取 出现次数最多的一个元素
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (Objects.isNull(map.get(num))) {
                map.put(num, 1);
            } else {
                Integer count = map.get(num);
                map.put(num, count + 1);
            }
           /* Integer out = map.getOrDefault(num, 0)+1;
            map.put(num,out);
            if(map.get(num)>len) return num;*/
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= len) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 5, 9, 5, 9, 5, 5, 5};
        Stream<HashMap<Integer, Integer>> hashMapStream = Arrays.stream(nums)
                .boxed()
                .map(e -> new HashMap<Integer, Integer>() {{
                    put(e, 1);
                }});
        hashMapStream.forEach(System.out::println);
    }
}
