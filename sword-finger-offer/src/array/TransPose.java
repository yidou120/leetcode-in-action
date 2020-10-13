package array;

/**
 * @ClassName TransPose
 * @Description 矩阵的转置
 * @Author 中森明菜
 * @Date 2020/10/11 18:22
 * @Version 1.0
 */
public class TransPose {
    public int[][] transpose(int[][] A) {
        int[][] out = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                out[j][i] = A[i][j];
            }
        }
        return out;
    }
}
