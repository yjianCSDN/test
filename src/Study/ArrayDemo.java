package Study;


import java.util.Arrays;

/**
 * @Author
 * @Date
 * 数组的sort方法，利用Array.sort能够将数组进行有序化处理
 */
public class ArrayDemo {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 78, 45, 7, 81, 721, 87, 45, 9615,};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
