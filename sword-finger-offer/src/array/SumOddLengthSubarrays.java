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
        // 计算每个数字出现的次数
        // 总和就是次数*数值
        int len = arr.length;
        int result = 0;
        for (int i=0;i<len-1;i++){
            // 左奇 number 右奇
            // 左偶 number 右偶
            // 左边可以选择的方案 可以选0,1,2..个数字
            int left = i + 1;
            int right = len - i;
            int leftEven = (left + 1)/2;
            int rightEven = (right + 1)/2;
            int leftOdd = left/2;
            int rightOdd = right/2;
            result +=  (leftEven*rightEven+leftOdd*rightOdd) * arr[i];
        }
        return result;
    }
}
