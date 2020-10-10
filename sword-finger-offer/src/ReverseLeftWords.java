/**
 * @ClassName ReverseLeftWords
 * @Description 左旋转字符串
 * @Author 中森明菜
 * @Date 2020/10/10 8:43
 * @Version 1.0
 */
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        String start = s.substring(0, n);
        String end = s.substring(n);
        return end + start;
    }
}
