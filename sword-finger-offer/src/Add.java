/**
 * @ClassName Add
 * @Description 不用加减乘除做加法
 * @Author 中森明菜
 * @Date 2020/4/28 10:24
 * @Version 1.0
 */
public class Add {
    public static void main(String[] args) {
        add(1,2);
    }
    //采用位运算
    public static int add(int a, int b) {
        while(b!=0){
            int c = (a & b)<<1; //进位
            a ^= b; //非进位和
            b = c;
        }
        return a;
    }
}
