package Study;

import java.util.Scanner;

/**
 * @Author
 * @Date
 * 二分法查找
 * 其原理为查找数字在数组中直接将数字与数组中间的书相比较进行判断
 * 如果大于就找更大的那部分的中间下标来继续比较，如果小于就更缩小查找范围
 * 以此类推直到查到数字的位置位置（或者数字不在该数组中）
 */
public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("请输入你想要查找的数字");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 21, 33};
         int index = BinarySearch.Search(A, i);
        System.out.println(index==-1?"这个数字在数组中不存在":"其下标为"+index+1);
    }

    public static int Search(int[] arr, int num) {

        int begin = 0;
        int end = arr.length - 1;

        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (num > arr[mid]) {
                begin = mid + 1;
            } else if (num < arr[mid]) {
                end = mid - 1;
            } else if (num == arr[mid]) {
                return mid;
            }

        }
        return -1;
    }
}

