/**
 * @ClassName SpiralOrder
 * @Description 顺时针打印矩阵
 * @Author 中森明菜
 * @Date 2020/4/26 19:59
 * @Version 1.0
 */
public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0) return new int[0];
        int l = 0,r = matrix[0].length-1,t = 0,b = matrix.length-1,x = 0;
        int[] result = new int[(r+1)*(b+1)];
        while(true){
            for(int i=l;i<=r;i++) result[x++]=matrix[t][i]; //left-right
            if(++t>b) break;
            for(int j=t;j<=b;j++) result[x++]=matrix[j][r]; //top-bottom
            if(--r<l) break;
            for(int o=r;o>=l;o--) result[x++]=matrix[b][o]; //bottom-right-left
            if(--b<t) break;
            for(int p=b;p>=t;p--) result[x++]=matrix[p][l]; //bottom-bottom-top
            if(++l>r) break;
        }
        return result;
    }
}
