package string;

/**
 * @ClassName ModifyString
 * @Description 给你一个仅包含小写英文字母和 '?' 字符的字符串 s，请你将所有的 '?' 转换为若干小写字母，使最终的字符串不包含任何 连续重复 的字符。
 * @Author 中森明菜
 * @Date 2020/10/12 10:01
 * @Version 1.0
 */
public class ModifyString {
    public String modifyString(String s) {
        // "?zs"
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') {
                char left = i == 0 ? ' ' : charArray[i - 1];
                char right = i == charArray.length - 1 ? ' ' : charArray[i + 1];
                char temp = 'a';
                while (temp == left || temp == right) {
                    temp++;
                }
                charArray[i] = temp;
            }
        }
        return new String(charArray);
    }

    public String modifyString2(String s) {
        // "j?qg??b"
        char[] charArray = s.toCharArray();
        char pre = ' ';
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') {
                char after = ' ';
                char temp = 'a';
                if(i == charArray.length-1){
                    after = ' ';
                }else {
                    after = charArray[i+1];
                }
                while (temp == pre || temp == after) {
                    temp += 1;
                }
                charArray[i] = temp;
                pre = temp;
            } else {
                pre = charArray[i];
            }
        }
        return new String(charArray);
    }
}
