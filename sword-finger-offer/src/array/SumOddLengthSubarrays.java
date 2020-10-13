package array;

/**
 * @ClassName SumOddLengthSubarrays
 * @Description 给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
 * @Author 中森明菜
 * @Date 2020/10/12 8:45
 * @Version 1.0
 */
public class SumOddLengthSubarrays {
    // [1,4,2,5,3]
    // 1 4 2 5 3
    // 1,4,2 4,2,5 2,5,3
    // 1,4,2,5,3
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int result = 0;
        for (int i=0;i<len;i++){
            for (int j=i;j<len;j+=2){
                result += arr[j];
            }
        }
        return result;
    }
}
