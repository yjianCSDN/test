package Study;

/**
 * @Author
 * @Date
 * 选择排序
 * 相比于冒泡排序来说交换位置的次数更少，相对于效率就更高。
 * 采用双层for循环来进行对比
 * 大致思路：
 * 首先遍历数组，从第一位数开始，找到其他位置下的最小的数字与第一位数进行交换
 * 再来到第二位数，找出剩下数组的数字找到最小的数字与第二位数进行交换
 * 以此类推得到排序好的数组，最后一次for循环进行输出即可
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] test = {22,1,4,5,6,9,7,45,12,5,8,15,4,8,1,57,9,12,98};
        SelectSort.Select(test);
    }

public static void Select(int[] A){
    for (int i =0; i<A.length-1;i++){
        int min = i;
        for (int j =i+1;j<A.length;j++){
            if (A[min]>A[j]){
                min = j;
            }
        }

        if(min!=i){
            int temp;
            temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
    }
    for (int i=0;i<A.length;i++){
        System.out.print(A[i]+" ");
    }
    }
}
