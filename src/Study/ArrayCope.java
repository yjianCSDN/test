package Study;

/**
 * @Author
 * @Date
 */
public class ArrayCope {
    public static void main(String[] args) {
        //数组创建的两种方式
        int[] src = new int[20];//20为数组的长度
        int[] j ={1,2,33,44,5,6};//也可以直接写数组里面的元素
        System.arraycopy(j,0,src,5,j.length);//数组拷贝：里面有五个元素，分别为：元，元的起始位置，目标数组，目标数组填充的起始位置以及拷贝长度
        for(int i =0;i<src.length;i++){
            System.out.print(src[i]+" ");
        }
    }
}
