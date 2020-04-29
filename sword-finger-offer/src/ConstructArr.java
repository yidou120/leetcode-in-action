/**
 * @ClassName ConstructArr
 * @Description 构建乘积数组
 * @Author 中森明菜
 * @Date 2020/4/29 11:14
 * @Version 1.0
 */
public class ConstructArr {
    public int[] constructArr(int[] a) {
        if(a.length == 0) return new int[0];
        int[] b = new int[a.length];
        b[0] = 1;
        int temp = 1;
        for(int i=1;i<a.length;i++){
            b[i] = b[i-1] * a[i-1]; //左边
        }
        for(int i=a.length-2;i>=0;i--){
            temp = temp * a[i+1];
            b[i] = b[i]*temp;
        }
        return b;
    }
}
