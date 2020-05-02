import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName GetLeastNumbers
 * @Description 最小的k个数
 * @Author 中森明菜
 * @Date 2020/5/2 14:30
 * @Version 1.0
 */
public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length==0 || k==0) return new int[0];
        Queue<Integer> queue = new PriorityQueue<Integer>(
                (v1,v2) -> v2-v1
        );
        for(int num:arr){
            if(queue.size()<k){
                queue.offer(num);
            }else if(queue.peek()>num){
                queue.poll();
                queue.offer(num);
            }
        }
        int[] result = new int[queue.size()];
        int flag = 0;
        for(int num:queue){
            result[flag++]=num;
        }
        return result;
    }
}

