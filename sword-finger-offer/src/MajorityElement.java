import java.util.*;

/**
 * @ClassName MajorityElement
 * @Description 数组中出现次数超过一半的数字
 * @Author 中森明菜
 * @Date 2020/4/27 14:19
 * @Version 1.0
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                Integer count = map.get(nums[i]);
                map.put(nums[i],count++);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Collection<Integer> values = map.values();
        Object[] objects = values.toArray();
        Arrays.sort(objects);
        for(Map.Entry<Integer,Integer> entry:entries){
            if(entry.getValue()==(Integer)objects[objects.length-1]){
                return entry.getKey();
            }
        }
        return -1;
    }
    //摩尔抵消法
    public int majorityElement2(int[] nums) {
        int votes = 0,x = 0;
        for(int num:nums){
            if(votes==0) x = num;
            votes += x==num ? 1:-1;
        }
        return x;
    }
}
