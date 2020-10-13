package array;

/**
 * @ClassName SortedSquares
 * @Description 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * @Author 中森明菜
 * @Date 2020/10/11 19:52
 * @Version 1.0
 */
public class SortedSquares {
    public int[] sortedSquares(int[] A) {
        int len = A.length - 1;
        int[] result = new int[A.length];
        int left = 0;
        int right = len;
        int index = len;
        while (index >= 0) {
            if (A[left] < 0 && -A[left] > A[right]) result[index--] = A[left] * A[left++];
            else result[index--] = A[right] * A[right--];
        }
        return result;
    }
}
