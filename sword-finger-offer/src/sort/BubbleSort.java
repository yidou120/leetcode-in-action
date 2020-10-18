package sort;

import java.util.Scanner;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序 降序
 * @Author 中森明菜
 * @Date 2020/10/18 20:39
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 需要排序的数字个数
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
